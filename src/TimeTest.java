
public class TimeTest {

	public static void main(String[] args) {
		
		Time t = new Time(0,14,23);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(16, 5, 43);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());

	}

}
