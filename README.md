# prjSignNumSeries

Aplicación de consola desarrollada como proyecto colaborativo que implementa **78 ejercicios de lógica de programación y estructuras de datos**, organizados en 6 módulos temáticos: secuencias matemáticas y de caracteres, generación de figuras ASCII, manipulación de cadenas, animaciones de carga en terminal, recursividad, autómatas finitos deterministas y matrices/arreglos.

---

## 👥 Integrantes

* **imbaquingo.mateo**
* **morillo.isaac**
* **olalla.alexandra**
* **placencia.isaac**
* **redrovan.marcell**

---

## 📋 Contenido del Proyecto

El programa ejecuta secuencialmente 6 bloques de ejercicios interactivos por consola:

### 1. Sequences Exercises (`SN01` – `SN19` | `SC01` – `SC17`)
Generación de series matemáticas y patrones de caracteres a partir de un parámetro $n_1$:
* **Series Numéricas (`SN01` – `SN19`):** Fibonacci, impares alternados con cero, cocientes de Fibonacci sobre impares/pares, números primos, cuadrados perfectos, progresiones aritméticas, potencias de 2 y 3, números oblongos, triangulares, factoriales, signos alternos, cuadrados desplazados, repunidades, números de Lucas, secuencias crecientes y alternadas.
* **Series de Caracteres (`SC01` – `SC17`):** Signos alternados, grupos crecientes y tipo Fibonacci (`+`, `*`), operadores cíclicos (`+ - * / %`), indicadores direccionales (`\ | / -`), secuencias alfabéticas, repetición de letras/vocales y alternancia de mayúsculas/minúsculas.

### 2. Figures Exercises (`F01` – `F19`)
Renderizado de patrones geométricos y matriciales en consola dado un tamaño $n_2$:
* **Cuadrados y Marcos:** Cuadrado hueco de asteriscos y marco alternando `*` y `+`.
* **Triángulos y Pirámides:** Triángulos rectángulos (izquierdo/derecho), pirámides centradas e invertidas, triángulos numéricos ascendentes/descendentes.
* **Escaleras y Cruces:** Escaleras descendentes, ascendentes, combinadas, con signos e iterativas; matrices en forma de `X` (signos y binaria).
* **Triángulos de Pascal:** Clásico centrado, acostado y variantes modificadas con bordes personalizados.

### 3. String Exercises (`C01` – `C09`)
Procesamiento y validación de cadenas de texto ingresadas por el usuario:
* Conteo y eliminación selectiva de vocales y letras.
* Inversión de vocales y letras alternadas con conversión a mayúsculas.
* Formateo condicional (conversión a mayúsculas excluyendo la letra `'J'`, alternancia `AsAsAs`).
* Verificación de anagramas entre dos frases.

### 4. Loading Exercises (`L01` – `L13` / `LN02` – `LN10`)
Simulaciones visuales y animaciones de progreso en terminal:
* Indicadores rotacionales (`| / - \`), barras de carga personalizables, desplazamiento de caracteres y animación `0oo`.
* Barras con punta móvil (`===>`), punta rotacional y descarga simulada de archivos (`kB`).
* Carga progresiva de nombre y apellidos (en bloque y letra por letra).
* Visualizadores gráficos en consola: señal simetrizada, ecualizador de barras sonoras aleatorias y figura ASCII en movimiento.

### 5. Recursive Exercises (`R01` – `R06`)
Implementación de algoritmos sin estructuras iterativas:
* Cálculo de factorial ($n!$).
* Suma y multiplicación mediante llamadas recursivas.
* Cálculo de potencia ($\text{base}^{\text{exponente}}$).
* Conteo progresivo ($1 \rightarrow n$) y regresivo ($n \rightarrow 0$).

### 6. Automata Exercises (`A01` – `A08`)
Reconocimiento de lenguajes regulares y validación léxica:
* Autómatas para expresiones regulares: `a*b+c`, `ab+ca`, `a+/b+/c+` y `1+/0+1*`.
* Validadores tipo compilador: números decimales, identificadores de variables y palabras reservadas (`if`, etc.).
* Validador de contraseñas seguras (longitud mínima, mayúsculas, minúsculas, dígitos y caracteres especiales).

### 7. Array Exercises (`A01` – `A05`)
Manipulación de vectores y matrices bidimensionales con datos del usuario:
* Barra de porcentaje de carga aplicada por palabra sobre el nombre completo.
* Generación de iniciales en arte ASCII de gran formato usando un carácter personalizado.
* Graficación de la función lineal $f(x) = 2x$ en un plano cartesiano positivo usando las letras del nombre.
* Matrices en forma de `X` y distribución en posiciones aleatorias con retardo (*delay*) usando nombres y apellidos.

---

## 🛠️ Requisitos y Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/Alex19731959/prjSignNumSeries.git](https://github.com/Alex19731959/prjSignNumSeries.git)
   cd prjSignNumSeries