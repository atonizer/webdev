package com.webdev.app;

import com.webdev.app.UserException;

/**
 * Класс реализует калькулятор.
 */
public class Calculator {
	/**
	 Результат вычисления.
	 */
	private int result;

	/**
	 * Суммируем аргументы.
	 * @param params Аргументы суммирования.
	 */
	public void add(int ... params) {
		for (int param : params) {
			this.result += param;
		}
	}

	/**
	 * Вычиляем деление.
	 * @param args входящие агрументы.
	 * @throws com.webdev.app.UserException Если агрументов нет, выкидывает исключение.
	 */
	public void div(int ... args) throws UserException {
		if (args.length > 0) {
			this.result = args[0];
			for (int params : args) {
				if (params == 0) {
					throw new IllegalArgumentException("You try to div by 0. Please change arg!");
				}
				this.result /= params;
			}
		} else {
			throw new UserException("You should enter args!");
		}
	}

	/**
	 * Получить результат.
	 * @return результат вычисления.
	 */
	public int getResult() {
		return this.result;
	}

	/**
	 * Очистить результат вычисления.
	 */
	public void cleanResult() {
		this.result = 0;
	}
}