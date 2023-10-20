package utilidades;

/**
 *
 * @author Gonz@_
 */
public class ProvinciasCiudades {
        public static String[] obtenerProvinciasArgentina() {
        return new String[]{
                "Buenos Aires", "Ciudad Autónoma de Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdoba",
                "Corrientes", "Entre Ríos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones",
                "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe",
                "Santiago del Estero", "Tierra del Fuego, Antártida e Islas del Atlántico Sur", "Tucumán"
        };
    }

    public static String[] obtenerCiudadesPorProvincia(String provincia) {
        //  obtener las ciudades de la provincia elegida
        switch (provincia) {
            case "Buenos Aires":
                return new String[]{"Almirante Brown", "Avellaneda", "Berazategui", "Berisso", "Brandsen", "Campana", "Cañuelas", "Ensenada", "Escobar", "Esteban Echeverría", 
            "Exaltación de la Cruz", "Ezeiza", "Florencio Varela", "General Las Heras", "General Rodríguez", "General San Martín", "Hurlingham", "Ituzaingó", "José C. Paz", "La Matanza",
            "La Plata", "Lanús", "Luján", "Lomas de Zamora", "Malvinas Argentinas", "Marcos Paz", "Merlo", "Moreno", "Morón", "Pilar", "Presidente Perón", "Quilmes", "San Fernando", 
            "San Isidro", "San Miguel", "San Vicente", "Tigre", "Tres de Febrero", "Vicente López", "Zárate"};  
                
            case "Catamarca":
                return new String[]{"San Fernando del Valle de Catamarca", "Valle Viejo", "Santa María", "Recreo", "Tinogasta", "Belén", "Andalgalá",  "Fray Mamerto Esquiú"};  
        
            default:
                return new String[0];  
        }
    }
}

