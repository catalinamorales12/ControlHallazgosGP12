# ControlHallazgosGP12

# ControlHallazgosGP12

## Tabla de Contenidos

- [Descripción](#descripción)
- [Problema Identificado](#problema-identificado)
- [Solución](#solución)
- [Arquitectura](#arquitectura)
- [Documentación completa](#documentación-completa)
- [Requerimientos](#requerimientos)
- [Instalación](#instalación)
- [Configuración](#configuración)
- [Uso](#uso)
- [Contribución](#contribución)
- [Roadmap](#roadmap)

---

##  Descripción

Control de Hallazgos en GP12 es una aplicación desarrollada para Hutchinson con el objetivo de mejorar la trazabilidad, gestión y resolución de incidencias detectadas en procesos internos. La herramienta permite registrar hallazgos, clasificarlos, darles seguimiento y generar reportes históricos, todo dentro de una interfaz intuitiva y modular.

---

##  Problema Identificado

En los procesos actuales de control de calidad y auditoría interna, se detectó una falta de sistematización en el registro y seguimiento de hallazgos. Esto generaba:

- Pérdida de información relevante  
- Dificultad para dar seguimiento a acciones correctivas  
- Ausencia de reportes históricos consolidados  
- Procesos manuales propensos a errores y duplicidad  

---

##  Solución

La aplicación Control de Hallazgos en GP12 automatiza el flujo de gestión de hallazgos mediante:

- Módulo de login seguro para control de acceso  
- Menú dinámico para navegación entre funcionalidades  
- Formulario estructurado para registrar hallazgos con campos clave  
- Módulo de historial que permite consultar y filtrar registros anteriores  
- Integración con CI/CD para pruebas automatizadas y despliegue continuo  
- Organización de tareas por etapas (Beta y GA) usando Trello y Zube  

---

##  Arquitectura

La arquitectura del sistema se basa en una estructura modular y escalable:

- **Frontend:** Interfaz construida con HTML/CSS  
- **Backend:** Lógica de negocio y persistencia con Java  
- **Base de datos:** PostgreSQL para almacenamiento de hallazgos  
- **CI/CD:** Pipeline configurado con GitHub Actions (o Travis CI/Drone) para pruebas JUnit y despliegue automatizado  
- **Control de versiones:** GitHub con ramas organizadas por funcionalidades y milestones  
- **Seguridad:** Implementación de protocolos básicos de autenticación y control de acceso  

---

## Documentación completa

- [Guía de usuario](https://github.com/catalinamorales12/ControlHallazgosGP12/wiki/Gu%C3%ADa-de-Usuario)  
- [Manual de instalación](https://github.com/catalinamorales12/ControlHallazgosGP12/wiki/Manual-de-Instalaci%C3%B3n)  

---

##  Requerimientos

### 1. Servidores y servicios utilizados

- Servidor de Aplicación: Apache Tomcat 9  
- Servidor Web: Integrado en Tomcat  
- Base de Datos: PostgreSQL (instancia en la nube)  
- IDE: Visual Studio Code  
- Sistema Operativo recomendado: Windows 11  

### 2. Paquetes y dependencias adicionales

- Conector JDBC para PostgreSQL  
- Librerías de Java para manejo de formularios y sesiones  
- Estilos personalizados con CSS  
- HTML para estructura de vistas  
- Configuración de conexión a base de datos en archivo `.properties` o `.xml`  

### 3. Versiones recomendadas

- Java: JDK 17  
- Tomcat: 9.0 o superior  
- PostgreSQL: 14 o superior  
- Visual Studio Code: Última versión estable  
- Navegador: Chrome, Firefox o Edge (actualizado)  

---

##  Instalación

### Requisitos del entorno

Antes de comenzar, asegúrate de tener instalado lo siguiente:

- Java JDK 17  
- Apache Tomcat 9  
- PostgreSQL (se recomienda instancia en la nube, pero puede ser local)  
- Visual Studio Code con extensiones para Java y Markdown  
- Conexión estable a internet para acceder a la base de datos remota  

### Instalación del ambiente de desarrollo

```bash
git clone https://github.com/catalinamorales12/ControlHallazgosGP12.git
cd ControlHallazgosGP12

- Importa el proyecto en Visual Studio Code.
- Configura Tomcat:
- Asegúrate de que Tomcat esté instalado y configurado como servidor en VS Code.
- Agrega el proyecto como aplicación web en Tomcat.

- Configura la conexión a PostgreSQL:
- Edita el archivo db/Conexion.java con tus credenciales de acceso a la base de datos remota.

### Ejecución de pruebas manuales

- Accede al módulo form/ y realiza pruebas de captura de datos.
- Verifica el historial en history/ para confirmar persistencia.
- Usa credenciales válidas en login/ para probar autenticación.
- Navega por menu/ para validar la estructura de navegación.
Implementación en producción

### Opción local
- Ejecuta el proyecto en Tomcat desde VS Code.
- Asegúrate de que la base de datos esté accesible desde tu entorno local.

## Configuración

### Archivos de configuración
- db/Conexion.java: contiene los parámetros de conexión a PostgreSQL.
- web.xml: configuración de rutas y servlets en Tomcat.
- login/config.properties: archivo opcional para credenciales o tokens.
### Requerimientos del sistema
- Sistema operativo: Windows
- Java JDK 17
- Apache Tomcat 9
- PostgreSQL 13+
- Navegador web actualizado (Chrome, Firefox, Edge)

## Uso

### Manual para usuario final

Una vez desplegado el sistema, el usuario final puede:
- Iniciar sesión en el módulo login/ con sus credenciales.
- Navegar por el sistema usando el menú principal (menu/).
- Capturar datos en formularios (form/) relacionados con hallazgos.
- Consultar historial de acciones en el módulo history/.
  
### Manual para usuario administrador

El administrador puede:
- Gestionar usuarios desde la base de datos PostgreSQL.
- Auditar acciones mediante el historial (history/).
- Validar integridad de datos y aplicar medidas de seguridad.
- Actualizar configuración en archivos como Conexion.java o web.xml.

## Contribución

https://github.com/catalinamorales12/ControlHallazgosGP12/blob/main/CONTRIBUTING.md


##  Roadmap

Estas son las funcionalidades y mejoras que se planean implementar en futuras versiones del sistema:

### Seguridad y validación
- Implementación de validaciones en formularios HTML.
- Autenticación con tokens o sesiones seguras.
- Registro de intentos fallidos de login.

### Administración y monitoreo
- Panel de control para usuarios administradores.
- Estadísticas de uso y reportes de hallazgos.
- Auditoría de acciones por usuario.

###  Integración y despliegue
- Configuración de CI/CD con GitHub Actions para pruebas automáticas.
- Despliegue en Heroku o plataforma en la nube.
- Exportación del proyecto como archivo WAR para producción.

### Mejora de experiencia de usuario
- Estilización avanzada con CSS responsivo.
- Validación en tiempo real en formularios.
- Navegación más intuitiva en el menú principal.

### Documentación y soporte
- Manual extendido para administradores.
- Guía de solución de errores comunes.
- Wiki con diagramas de arquitectura y flujo de datos.




