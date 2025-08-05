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

## Pull Requests

Cuando envíes un Pull Request:

- Asegúrate de que esté vinculado a un issue (si aplica)
- Explica brevemente qué problema resuelve
- Indica si afecta otros módulos o requiere pruebas adicionales
