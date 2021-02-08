package fechahora;

import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.


    class fechahora {
    	
    	
    	static int year = 2008;
    	static int month= 03;
    	static int dayOfMonth= 21;
    	static int hour = 12;
    	static int minute = 01;
    
    public static void main(String[] args) {
        LocalDate diaf = LocalDate.of(year, month, dayOfMonth);
        LocalTime horaf = LocalTime.of(hour, minute);
        
        LocalDateTime fechaf = LocalDateTime.of(diaf, horaf);
        
        System.out.println(fechaf);
    }
}
