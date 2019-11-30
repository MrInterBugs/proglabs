#!/usr/bin/env python3                                                  

# a list of points {x, y}                                               
points = [[5, 10],                                                      
          [23, 100000000000000000000],                                                      
          [75, 23],                                                     
          [53, 22],                                                     
          [95, 98],                                                     
          [99, 59],                                                     
          [34, 87],                                                     
          [83, 88],                                                     
          [65, 42],                                                     
          [0, 76]]                                                      

def distance_between(point1, point2):                                   
    xdist = point2[0] - point1[0]                                       
    ydist = point2[1] - point1[1]                                       
    distance = (xdist**2 + ydist**2)**0.5                               
    return distance                                                     

def get_longest_trip(points):                                           
    """Finds the longest straight-line distance between two points      
    :param points: a list of points, each represented as a length-2     
    list of x and y coord.                                              
    :returns: the longest straight-line distance between any two points
    in points"""                                                        
    longest_distance = 0                                                
    for point1 in points:                                               
        for point2 in points:                                           
            if(distance_between(point1, point2) > longest_distance):    
                longest_distance = distance_between(point1, point2)                               
    return longest_distance                                             

longestTrip = get_longest_trip(points)                                  
print("The longest trip is ", longestTrip) 
