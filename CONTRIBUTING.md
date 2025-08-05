# Guía de Contribución

¡Gracias por tu interés en contribuir a este proyecto! Antes de comenzar, por favor revisa las siguientes pautas para asegurar una colaboración clara y efectiva.

## Requisitos previos

Antes de contribuir, asegúrate de tener configurado lo siguiente:

- Java JDK 17
- Apache Tomcat 9
- PostgreSQL (instancia en la nube)
- Visual Studio Code con extensiones para Java y Markdown
- Conexión estable a internet para acceder a la base de datos remota

## Tipos de contribuciones

Puedes contribuir de las siguientes maneras:

- Corrección de errores
- Mejora de documentación
- Optimización de código Java
- Estilización con CSS
- Refactorización de formularios HTML
- Propuestas de seguridad o validación de datos

##  Organización del proyecto

El proyecto está estructurado por módulos:

- `login/` – autenticación de usuarios
- `menu/` – navegación principal
- `form/` – captura de datos
- `history/` – historial de acciones
- `db/` – configuración de conexión a PostgreSQL

## Buenas prácticas

- Usa ramas para cada contribución (`feature/nombre`, `fix/nombre`)
- Describe claramente tus cambios en los commits
- Asegúrate de que el código compila y pasa pruebas básicas
- Mantén la coherencia en la indentación y estilo de código
- Documenta cualquier cambio en el `README.md` si es relevante

## Reporte de errores

Si encuentras un error:

1. Abre un issue en GitHub con título claro
2. Describe el comportamiento esperado y el observado
3. Incluye pasos para reproducirlo y capturas si es posible

## Proceso para contribuir

Sigue estos pasos para enviar tu contribución correctamente:

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/usuario/nombre-del-repositorio.git
   cd nombre-del-repositorio

   - Crear una nueva rama:
git checkout -b feature/nombre-de-tu-rama
- Realizar tus cambios y hacer commit:
git add .
git commit -m "Descripción clara de los cambios"
- Enviar tu rama al repositorio remoto:
git push origin feature/nombre-de-tu-rama
- Crear un Pull Request:
- Ve a GitHub y abre un nuevo Pull Request desde tu rama.
- Asegúrate de describir qué problema resuelve y qué módulos afecta.
- Esperar revisión y aprobación:
- Tu Pull Request será revisado.
- Si todo está correcto, se hará el merge a la rama principal.

