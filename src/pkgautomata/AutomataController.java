package pkgautomata;

public class AutomataController {

    public void showAutomataExercises1() {

        AutomataExercises1 automataExercises1 = new AutomataExercises1();
        AutomataExercises2 automataExercises2 = new AutomataExercises2();
        CompilerExercises compilerExercises = new CompilerExercises();
        ValidatorExercises validatorExercises = new ValidatorExercises();

        automataExercises1.g2ValidarCadena1();
        automataExercises1.g2ValidarCadena2();

        automataExercises2.g2ValidarCadena3();
        automataExercises2.g2ValidarCadena4();

        compilerExercises.g2ValidarDecimal();
        compilerExercises.g2EjecutarValidador();
        compilerExercises.g2EjecutarValidadorLenguaje();

        validatorExercises.g2EjecutarValidadorPassword();
        
    }
}
