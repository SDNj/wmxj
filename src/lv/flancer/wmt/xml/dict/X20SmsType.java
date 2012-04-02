/**
 *
 */
package lv.flancer.wmt.xml.dict;

/**
 * Тип СМС в запросе X20. Данное поле определяет тип подтверждения клиентом
 * транзакции. Если в данном поле передать цифру 1, то клиенту будет выслана
 * СМС. Если цифра 2, то клиенту будет передан USSD запрос. Если цифра 3, то
 * будет произведена попытка (из настроек сделанных самим клиентом и анализа
 * предыдущих платежей и т.п.) определить автоматически какой запрос будет
 * предпочтительней для клиента (в случае неуспеха будет выбран тип СМС). Если
 * цифра 4, то ни СМС ни USSD запроса отправляться не будет и будет только
 * выставлен ВМ-счет, который клиент сможет оплатить через мобильное или
 * какое-либо другое приложение WebMoney, но в этом случае будет недоступна
 * оплата через WebMoney чек, так как в нем оплата возможна только при
 * подтверждении через СМС(USSD). При этом обращаем внимание, что независимо ни
 * от какого значения данного параметра, если интерфейс определит, что оплата
 * будет производиться с ВМ-идентификатора (не с WebMoney чека для которого
 * обязательно нужен мобильный), то ВМ-счет все равно всегда будет выставлен
 * клиенту. При этом клиент может не получить СМС или USSD запрос (если
 * интерфейс вызывается именно с отправкой СМС), но он может оплатить счет в
 * любом мобильном приложении по управлению кошельками и оплата пройдет штатно.
 *
 * Просто в подтверждающем запросе приложение продавца может не передавать
 * подтверждающий код (передать значение кода равно 0) или даже передать любой
 * код, при этом в ответе все равно будут переданы данные успешного платежа.
 * Оптимальным для любых случаев в данном запросе является передача цифры 3.
 *
 *
 * @author ainar
 */
public enum X20SmsType {

    SMS(1), USSD(2), DETERMINE_AUTOMATICALLY(3), INVOICE(4);
    /**
     * Значение перечисления.
     *
     */
    private int value;

    private X20SmsType(int value) {
        this.value = value;
    }

    /**
     * Возвращает значение типа по его коду.
     *
     * @param code
     * @return значение типа
     */
    public static X20SmsType getByValue(int code) {
        switch (code) {
            case 1:
                return SMS;
            case 2:
                return USSD;
            case 3:
                return DETERMINE_AUTOMATICALLY;
            case 4:
                return INVOICE;
        }
        return DETERMINE_AUTOMATICALLY;
    }
    
    /**
     * Возвращает значение типа по его коду.
     *
     * @param code код значения
     * @return значение типа
     */
    public static X20SmsType getByValue(String code) {
		return getByValue(Integer.parseInt(code));
    }
    
    /**
     * Возвращает код по значению типа.
     *
     * @param smsType Тип СМС
     * @return код значение 
     */
    public static int getValue(X20SmsType smsType) {    
        return smsType.value;
    }
    
}
