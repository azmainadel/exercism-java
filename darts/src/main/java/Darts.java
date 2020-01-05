class Darts {
    private static final double OUTER_CIRCLE_RADIUS = 10;
    private static final double MIDDLE_CIRCLE_RADIUS = 5;
    private static final double INNER_CIRCLE_RADIUS = 1;

    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceFromCenter(){
        return Math.sqrt(x * x + y * y);
    }

    int score() {
        double distance = distanceFromCenter();

        if(distance > OUTER_CIRCLE_RADIUS) return 0;
        else if(distance <= OUTER_CIRCLE_RADIUS && distance > MIDDLE_CIRCLE_RADIUS) return 1;
        else if (distance <= MIDDLE_CIRCLE_RADIUS && distance > INNER_CIRCLE_RADIUS) return 5;
        else if(distance <= INNER_CIRCLE_RADIUS) return 10;

        return 0;
    }
}
