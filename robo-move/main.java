public static void moveRobot(Robot robot, int toX, int toY) {
    // 1. Движение по оси X
    if (robot.getX() < toX) {
        // Если цель правее, поворачиваемся направо (RIGHT)
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        // Идем вперед, пока не дойдем до toX
        while (robot.getX() < toX) {
            robot.stepForward();
        }
    } else if (robot.getX() > toX) {
        // Если цель левее, поворачиваемся налево (LEFT)
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        // Идем вперед, пока не дойдем до toX
        while (robot.getX() > toX) {
            robot.stepForward();
        }
    }

    // 2. Движение по оси Y
    if (robot.getY() < toY) {
        // Если цель выше, поворачиваемся вверх (UP)
        while (robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
        // Идем вперед, пока не дойдем до toY
        while (robot.getY() < toY) {
            robot.stepForward();
        }
    } else if (robot.getY() > toY) {
        // Если цель ниже, поворачиваемся вниз (DOWN)
        while (robot.getDirection() != Direction.DOWN) {
            robot.turnLeft();
        }
        // Идем вперед, пока не дойдем до toY
        while (robot.getY() > toY) {
            robot.stepForward();
        }
    }
}
