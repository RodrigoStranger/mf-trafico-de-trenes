# Sistema de Control de Tráfico de Trenes

Este proyecto implementa un sistema de control de tráfico de trenes utilizando métodos formales. Incluye modelos en VDM++ para la especificación formal y modelos de tiempo real en UPPAAL para la verificación de propiedades de seguridad.

## 📋 Características Principales

- Control de velocidad automático de trenes
- Detección de obstáculos y mantenimiento de distancia segura
- Especificación formal en VDM++
- Modelado de tiempo real en UPPAAL
- Pruebas automatizadas para verificación de propiedades

## 🚂 Componentes del Sistema

### Modelo VDM++
- `SistemaControl.vpp`: Clase principal que gestiona múltiples trenes
- `Tren.vpp`: Implementación del comportamiento del tren
- `Sensor.vpp`, `SensorDeProximidad.vpp`, `SensorEntreTrenes.vpp`: Componentes de sensores
- `Alerta.vpp`: Sistema de notificaciones

### Modelo UPPAAL
- `tren_control.xml`: Modelo de tiempo real del sistema de control
  - Plantilla `Tren`: Modela el comportamiento del tren (acelerar, frenar, velocidad normal)
  - Plantilla `SistemaControl`: Coordina las acciones de control

## 🚀 Ejecución de Pruebas

Para ejecutar las pruebas del modelo VDM++:

```vdmpp
>> tcov reset
>> create test:= new TestSuite()
>> print test.runAllTests()
>> tcov write test.tc
>> rtinfo test.tc
```

## 🏗️ Modelo UPPAAL

El modelo UPPAAL incluye:
- Estados del tren:
  - `Velocidad_Normal`: Estado de operación estándar
  - `Acelerando`: Cuando el tren aumenta su velocidad
  - `Frenado`: Cuando el tren está frenando

- Variables de control:
  - `velocidad_tren`: Velocidad actual del tren (km/h)
  - `distancia_segura`: Distancia mínima de seguridad (100m)
  - `limite_velocidad`: Límite de velocidad permitido (90 km/h)
  - `obstaculo_detectado`: Indicador de detección de obstáculos

## 📊 Casos de Prueba

El directorio `Uppaal/Casos de prueba/` contiene varios escenarios de prueba, incluyendo:
- `CasoAcelerar.uctr`: Prueba de aceleración del tren
- `CasoFrenarVelocidadSuperada.uctr`: Prueba de frenado por exceso de velocidad
- `CasoObstaculoFrenar.uctr`: Prueba de detección de obstáculos

## 📚 Documentación Adicional

- `articulo/articulo.pdf`: Documentación técnica del proyecto
- `diagrama de clases/`: Diagramas del sistema
- `latex/`: Código fuente de la documentación

## 📝 Requisitos

- Overture Tool para VDM++
- UPPAAL para modelos de tiempo real

## 📄 Licencia

Este proyecto está bajo la Licencia MIT.
