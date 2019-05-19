import akka.actor.{ActorSystem, Props}

object App {
  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem.create();
    val myActor = actorSystem.actorOf(Props(new MyActor), "myActor");
    myActor.tell("test", null);
    myActor.tell("", null);
  }
}

