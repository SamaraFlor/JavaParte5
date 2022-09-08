
public class Time {

	private int hora;
	private int minuto;
	private int segundo;
	
	
	public Time(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	

	public Time(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = 0;
	}

	
	public Time(int hora) {
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	}



	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	public int getMinuto() {
		return minuto;
	}


	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}


	public int getSegundo() {
		return segundo;
	}


	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void setTime(int hora,int minuto,int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		
	}
	
	public String exibirHoraUniversal() {
		return fmtNum(hora) + ":" + fmtNum(this.minuto) +":"+ fmtNum(this.segundo);
	}
	
	public String exibirHoraPadrao() {
		
		String sufixo;
		String horaPadrao;
		
		if (hora == 0 ) {
			horaPadrao = String.valueOf(12);
			sufixo = "AM";	
		} 
		else if(hora == 12) {
			horaPadrao = String.valueOf(hora);
			sufixo = "PM";
		}
		else if(hora > 0 && hora <12) {
			horaPadrao = String.valueOf(fmtNum(hora));
			sufixo = "AM";
		}
		else {
			horaPadrao = String.valueOf(fmtNum(hora-12));
			sufixo = "PM";
		}
		
		return horaPadrao + ":" + fmtNum(this.minuto) + ":"+ fmtNum(this.segundo) + sufixo;
	}
	
	private String fmtNum(int num) {
		if (num < 10) {
			return "0" + num;
		}
		return String.valueOf(num);
	}
	
}
