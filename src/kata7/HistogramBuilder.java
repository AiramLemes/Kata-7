package kata7;

public class HistogramBuilder {
    private final Iterable<Flight> flights;
    
    
    public HistogramBuilder(Iterable<Flight> flights) {
        this.flights = flights;
    }
    
    
    public Histogram build(String type, String filter, String bin) {
        Histogram histogram = new Histogram(type, filter, bin);
        
        for (Flight flight : this.flights) {
            
            if (filter != null && flight.getDayOfWeek().toString().equals(filter)) {
                if (bin != null && Integer.parseInt(bin) >= flight.get(type)) {
                    histogram.increment(flight.get(type));
                }
                
                else if (bin == null){
                    histogram.increment(flight.get(type));
                }
                
            } 
            
            if (filter == null) {
                
                histogram.increment(flight.get(type));
            }
        }
        
    return histogram;
}
    
    
}
