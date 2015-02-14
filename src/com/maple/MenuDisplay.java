package com.maple;

//각 메뉴 정보를 출력할 때는(Template Method) 이름, 가격, 매운정도를 확인할 수 있습니다.

public class MenuDisplay extends AbstractDisplay {

	@Override
	public void open() {
		System.out.println("**********메  뉴  판**********");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		System.out.println("********** 송도 치킨 **********");
	}

}
