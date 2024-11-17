package forge;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene {

    private boolean changingScene = false;
    private float timeToChangeScene = 2.0f;
    public LevelEditorScene() {
        System.out.println("Level Editor Scene");
    }

    @Override
    public void update(float dt) {

        if(!changingScene && KeyListener.isKeyPressed(KeyEvent.VK_ESCAPE)) {
           changingScene = true;
        }

        if(changingScene && timeToChangeScene > 0) {
            timeToChangeScene -= dt;
            
        } else if (changingScene) {
            Window.changeScene(1);
        }
    }
}
