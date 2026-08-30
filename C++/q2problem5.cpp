#include <iostream>
#include <cmath>

using namespace std;


inline double distanceBetween(double x1, double y1,
                              double x2, double y2)
{
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
}


inline double toRadians(double degrees)
{
    return degrees * (M_PI / 180.0);
}


inline double clamp(double value, double minVal, double maxVal)
{
    if (value < minVal)
        return minVal;

    if (value > maxVal)
        return maxVal;

    return value;
}


inline bool isInSafeZone(double x, double y,
                         double cx, double cy,
                         double radius)
{
    double distance = distanceBetween(x, y, cx, cy);

    return distance <= radius;
}

int main()
{
    // Home position
    double homeX = 0.0;
    double homeY = 0.0;

    // Safe-zone radius
    double safeRadius = 50.0;

    // Three waypoints
    double x1 = 30.0;
    double y1 = 40.0;

    double x2 = 10.0;
    double y2 = 20.0;

    double x3 = 60.0;
    double y3 = 10.0;

    
    double distance1 = distanceBetween(homeX, homeY, x1, y1);
    bool safe1 = isInSafeZone(x1, y1,
                              homeX, homeY,
                              safeRadius);

    cout << "Waypoint 1: (" << x1 << ", " << y1 << ")" << endl;
    cout << "Distance from home: " << distance1 << endl;
    cout << "Inside safe zone: "
         << (safe1 ? "Yes" : "No") << endl;

    
    double distance2 = distanceBetween(homeX, homeY, x2, y2);
    bool safe2 = isInSafeZone(x2, y2,
                              homeX, homeY,
                              safeRadius);

    cout << "\nWaypoint 2: (" << x2 << ", " << y2 << ")" << endl;
    cout << "Distance from home: " << distance2 << endl;
    cout << "Inside safe zone: "
         << (safe2 ? "Yes" : "No") << endl;

    
    double distance3 = distanceBetween(homeX, homeY, x3, y3);
    bool safe3 = isInSafeZone(x3, y3,
                              homeX, homeY,
                              safeRadius);

    cout << "\nWaypoint 3: (" << x3 << ", " << y3 << ")" << endl;
    cout << "Distance from home: " << distance3 << endl;
    cout << "Inside safe zone: "
         << (safe3 ? "Yes" : "No") << endl;

    return 0;
}