#include <string>
#include <ctime>
#include <iostream>
#include <fstream>
#include <sstream>
#include <iomanip>

using namespace std;

class Phong {
private:
    string roomID;
    string roomType;
    bool isAvailable;
    int roomFloor;
    int roomCapacity;
    int roomPrice;
    tm checkIn;
    tm checkOut;

public:
    Phong(string id, string type, int floor, int capacity,bool available, int price);
    
    string getRoomID() const;
    string getRoomType() const;
    bool getIsAvailable() const;
    int getRoomFloor() const;
    int getRoomCapacity() const;
    double getRoomPrice() const;
    tm getCheckIn() const { return checkIn; }
    tm getCheckOut() const { return checkOut; }
    string trim(const string& str);
    
    void setIsAvailable(bool available);
    void setCheckIn(tm time);
    void setCheckOut(tm time);
    void setRoomType(const string& type);
    void setRoomPrice(int price);
    void setRoomFloor(int floor);
    void setRoomCapacity(int capacity);
    int thoigianthue() const;
    long long tienthuephong() const;
    void displayRoomInfo() const;
   
};

struct Node {
public:
    Phong room;
    Node* next;
    Node(Phong r) : room(r), next(NULL) {}
};

class LinkedlistPhong {
public:
    Node* head;
    LinkedlistPhong() : head(NULL) {}
    ~LinkedlistPhong();
    
    void addRoom(Phong room);
    bool deleteRoom(const string& roomID);
    void displayRooms() const;
    bool updateRoom(const string& roomID, bool isAvailable);
    Phong* findRoom(const string& roomID);
    void findAndDisplayRoom(const string& roomID);
    void readRoomsFile(const string& filename);
    void calculateRoom(const string& roomID);
    bool isRoomExit(const string& roomID) const;
    void sortRooms();
    bool editRoom(const string& roomID);
    bool DateTime(int& ngay, int& thang, int& nam, int& gio);
    void outputDateTime(const string& time);
    void bookRoom(const string& roomID);
    void checkOutRoom(const string& roomID);

};