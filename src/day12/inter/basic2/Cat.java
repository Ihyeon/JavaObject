package day12.inter.basic2;

public class Cat extends Animal implements IPet {

	@Override
	public void eating() {
		System.out.println("고양이는 생선을 먹어요");
	}

	@Override
	public void playing() {
		System.out.println("고양이는 집에서 놀아요");
	}

}
