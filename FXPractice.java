import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.*;

public class FXPractice extends Application {

  public void start(Stage stage){
    Text hello = new Text(50, 30, "Hello World!");
    Text question = new Text(120, 60, "I am Snowman?");
    //Rectangle box = new Rectangle(100, 150, 75, 75);
    Rectangle box2 = new Rectangle(0, 200, 300, 100);
    Rectangle hat = new Rectangle(130, 75, 40, 30);
    Rectangle bill = new Rectangle(125, 105, 50, 5);
    Circle circle1 = new Circle();
    Circle circle2 = new Circle();
    Line arm1 = new Line();
    Line arm2 = new Line();
    Circle eye1 = new Circle();
    Circle eye2 = new Circle();
    Arc smile = new Arc();
    Arc nose = new Arc();

    arm1.setStartX(125.0f);
    arm1.setStartY(165.0f);
    arm1.setEndX(100.0f);
    arm1.setEndY(130.0f);

    arm2.setStartX(175.0f);
    arm2.setStartY(165.0f);
    arm2.setEndX(200.0f);
    arm2.setEndY(130.0f);

    circle1.setCenterX(150.0f);
    circle1.setCenterY(185.0f);
    circle1.setRadius(35.0f);

    circle2.setCenterX(150.0f);
    circle2.setCenterY(125.0f);
    circle2.setRadius(25.0f);

    eye1.setCenterX(142.0f);
    eye1.setCenterY(115.0f);
    eye1.setRadius(3.0f);

    eye2.setCenterX(158.0f);
    eye2.setCenterY(115.0f);
    eye2.setRadius(3.0f);

    circle1.setStroke(Color.BLACK);
    circle1.setFill(Color.WHITE);

    circle2.setStroke(Color.BLACK);
    circle2.setFill(Color.WHITE);

    eye1.setFill(Color.BLACK);
    eye2.setFill(Color.BLACK);

    box2.setStroke(Color.WHITE);
    box2.setFill(Color.WHITE);

    hat.setFill(Color.BLACK);
    bill.setFill(Color.BLACK);

    smile.setCenterX(150.0f);
    smile.setCenterY(135.0f);
    smile.setRadiusX(4.0f);
    smile.setRadiusY(4.0f);
    smile.setStartAngle(180.0f);
    smile.setLength(185.0f);
    smile.setType(ArcType.OPEN);

    nose.setCenterX(137.0f);
    nose.setCenterY(130.0f);
    nose.setRadiusX(15.0f);
    nose.setRadiusY(15.0f);
    nose.setStartAngle(0.0f);
    nose.setLength(30.0f);
    nose.setType(ArcType.ROUND);

    nose.setStroke(Color.ORANGE);
    nose.setFill(Color.ORANGE);

    Group root = new Group(hello, question, circle2, circle1, hat, bill, nose, smile, eye1, eye2, arm1, arm2, box2);
    Scene scene = new Scene(root, 300, 300, Color.LIGHTBLUE);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
