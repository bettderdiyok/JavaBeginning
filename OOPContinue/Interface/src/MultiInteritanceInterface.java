public class MultiInteritanceInterface {
    public static void main(String[] args) {

    }
}


abstract class Singer {
    abstract  void  SingASong ();
}

interface ArabesqueSingers {
    void Smoke();
}

interface PopSingers {
    void Dance();
}
class ArabesqueSinger extends Singer {

    @Override
    void SingASong() {
        System.out.println("The arabesque singer is singing a song");
    }

}

class PopSinger extends  Singer {

    @Override
    void SingASong() {
        System.out.println("The pop singer is singing a song");
    }

}

class MuslumDad implements ArabesqueSingers,PopSingers {

    @Override
    public void Dance() {

    }

    @Override
    public void Smoke() {

    }
}