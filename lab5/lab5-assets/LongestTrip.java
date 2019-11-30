import java.lang.Math; 

public class LongestTrip {

    public static void main(String[] args) {
        // a list of points {x, y}
        int[][] points = {{5, 10},
                {23, 100000000},
                {75, 23},
                {53, 22},
                {95, 98},
                {99, 59},
                {34, 87},
                {83, 88},
                {65, 42},
                {0, 76}};

        double longestTrip = getLongestTrip(points);

        System.out.println("The longest trip is " + longestTrip);
    }

    /**
     * Finds the longest straight-line distance between two points
     *
     * @param points an array of points, each represented as a length-2
     * array of x and y coord.
     * @return 
     */
    public static double getLongestTrip(int[][] points) {
    	int x1 = 0, y1 = 0, y2 = 0, x2 = 0, max = 0, len = 0, z = 0, a = 0, b = 0;
    	double c = 0;
    	len = points.length;
        // TODO: calculate longest distance
        for (int i = 0; i<len; i++) {
            x1 = points[i][0]; 
            y1 = points[i][1];
            for () {
            	z = i++;
            	x2 = points[z][0]; 
                y2 = points[z][1];
                if(x1>x2) {
                	a = x1 - x2;
                	if(y1>y2) {
                		b = y1 - y2;
                	} else {
                		b = y2 - y1;
                	}
                } else {
                	a = x2-x1;
                	if(y1>y2) {
                		b = y1 - y2;
                	} else {
                		b = y2 - y1;
                	}
                }
            }
        }
        a = a*a;
        b = b*b;
        c = a + b;
        c = Math.sqrt(c);
        return(c);
		
		for(int j = 0; j<len; j++) {                                               
			for(int i = 0; i<len; i++) {                                           
				if(distance_between(point1, point2) > longest_distance):    
                longest_distance = distance_between(point1, point2)                               
    return longest_distance
	    }
    }
}
