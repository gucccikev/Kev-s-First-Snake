public class Snake {
    
    static final int MAX_INPUT = 100000000;

    Coordinate [] coordinateArray;
    int numberOfElements;
    
    Snake() {
        coordinateArray = new Coordinate[MAX_INPUT];
        numberOfElements = 0;
    }

    void moveSnake(Coordinate coordinate) {
        //since we only move the snake rather than adding a piece, we don't use "numberOfElements + 1"
        for(int i = numberOfElements; i >= 1; i--) {
            coordinateArray[i] = coordinateArray[i-1];
        }
        coordinateArray[0] = coordinate;
    }

    void addCordinateAtTheBack(Coordinate coordinate) {
        //because the last element in the array is always: numberOfElements – 1. You can say, set my new element on last one + 1. Or in other words numberOfElements – 1 + 1 equals numberOfElements.
        coordinateArray[numberOfElements] = coordinate;
	    numberOfElements ++;
    }
}
