package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarCustomizerTest {

    @Test
    public void givenCarCustomizerAndNormalCar_whenDriveWithLaunchControl_thenShouldDriveWithLaunchControl(){
        Car normalCar = new NormalCar();
        CarCustomizer carCustomizer = new CarCustomizer(normalCar);

        boolean driveWithLaunchControl = carCustomizer.driveWithLaunchControl();

        assertTrue(driveWithLaunchControl);
    }
}
