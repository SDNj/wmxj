/**
 * 
 */
package ru.webmoney.api.resp;

import ru.webmoney.api.dict.Wmid;

/**
 * Интерфейс X7: Проверка АСП клиента - владельца WM Keeper Classic.
 * 
 * @author Alex Gusev <flancer64@gmail.com>
 * @version 1.0
 * 
 */
public class X7Response extends AbstractResponse {
	/**
	 * Скорее всего - wmid, которым была подписана проверяемая подпись (в
	 * описании интерфейса X7 отсутствует).
	 */
	private Wmid cWmid;
	/**
	 * Результат аутентификации. 'True' - аутентификация выполнена успешно,
	 * 'False' - аутентификация не выполнена (неверная подпись клиента).
	 */
	private boolean res;

	/**
	 * Скорее всего - wmid, которым была подписана проверяемая подпись (в
	 * описании интерфейса X7 отсутствует).
	 * 
	 * @return Скорее всего - wmid, которым была подписана проверяемая подпись
	 *         (в описании интерфейса X7 отсутствует).
	 */
	public Wmid getcWmid() {
		return cWmid;
	}

	/**
	 * Результат аутентификации. 'True' - аутентификация выполнена успешно,
	 * 'False' - аутентификация не выполнена (неверная подпись клиента).
	 * 
	 * @return Результат аутентификации. 'True' - аутентификация выполнена
	 *         успешно, 'False' - аутентификация не выполнена (неверная подпись
	 *         клиента).
	 */
	public boolean isRes() {
		return res;
	}

	/**
	 * Скорее всего - wmid, которым была подписана проверяемая подпись (в
	 * описании интерфейса X7 отсутствует).
	 * 
	 * @param cWmid
	 *            Скорее всего - wmid, которым была подписана проверяемая
	 *            подпись (в описании интерфейса X7 отсутствует).
	 */
	public void setCwmid(String cWmid) {
		this.cWmid = new Wmid(cWmid);
	}

	/**
	 * Скорее всего - wmid, которым была подписана проверяемая подпись (в
	 * описании интерфейса X7 отсутствует).
	 * 
	 * @param cWmid
	 *            Скорее всего - wmid, которым была подписана проверяемая
	 *            подпись (в описании интерфейса X7 отсутствует).
	 */
	public void setCwmid(Wmid cWmid) {
		this.cWmid = cWmid;
	}

	/**
	 * Результат аутентификации. 'True' - аутентификация выполнена успешно,
	 * 'False' - аутентификация не выполнена (неверная подпись клиента).
	 * 
	 * @param res
	 *            Результат аутентификации. 'True' - аутентификация выполнена
	 *            успешно, 'False' - аутентификация не выполнена (неверная
	 *            подпись клиента).
	 */
	public void setRes(boolean res) {
		this.res = res;
	}
}