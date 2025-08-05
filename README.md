# ControlHallazgosGP12

Descripción

Control de Hallazgos en GP12 es una aplicación desarrollada para Hutchinson con el objetivo de mejorar la trazabilidad, gestión y resolución de incidencias detectadas en procesos internos. La herramienta permite registrar hallazgos, clasificarlos, darles seguimiento y generar reportes históricos, todo dentro de una interfaz intuitiva y modular.
Problema Identificado
En los procesos actuales de control de calidad y auditoría interna, se detectó una falta de sistematización en el registro y seguimiento de hallazgos. Esto generaba:
- Pérdida de información relevante
- Dificultad para dar seguimiento a acciones correctivas
- Ausencia de reportes históricos consolidados
- Procesos manuales propensos a errores y duplicidad
  
Solución

La aplicación Control de Hallazgos en GP12 automatiza el flujo de gestión de hallazgos mediante:
- Módulo de login seguro para control de acceso
- Menú dinámico para navegación entre funcionalidades
- Formulario estructurado para registrar hallazgos con campos clave
- Módulo de historial que permite consultar y filtrar registros anteriores
- Integración con CI/CD para pruebas automatizadas y despliegue continuo
- Organización de tareas por etapas (Beta y GA) usando Trello y Zube
  
Arquitectura

La arquitectura del sistema se basa en una estructura modular y escalable:
- Frontend: Interfaz construida con [HTML/CSS]
- Backend: Lógica de negocio y persistencia con [Java]
- Base de datos: [MySQL, postgress] para almacenamiento de hallazgos
- CI/CD: Pipeline configurado con GitHub Actions (o Travis CI/Drone) para pruebas JUnit y despliegue automatizado
- Control de versiones: GitHub con ramas organizadas por funcionalidades y milestones
- Seguridad: Implementación de protocolos básicos de autenticación y control de acceso



