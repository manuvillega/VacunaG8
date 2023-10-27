package utilidades;

/**
 *
 * @author Gonz@_
 */
public class ProvinciasCiudades {

    public static String[] obtenerProvinciasArgentina() {
        return new String[]{
            "Buenos Aires", "Ciudad Autonoma de Buenos Aires", "Catamarca", "Chaco", "Chubut", "Córdoba",
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

            case "Ciudad Autonoma de Buenos Aires":

                return new String[]{"Retiro", "San Nicolas", "Puerto Maderos", "San Telmo", "Monserrat Y Constitución", "Recoleta", "San Cristobal y Balvanera", "Boca", "Barracas", "Parque Patricios",
                    "Almagro", "Boedo", "Caballito", "Flores", "Pque Chacabuco", "Villa Soldati", "Villa Riachuelo", "Villa Lugano", "Pque Avellaneda", "Liniers", "Mataderos", "Villa Real", "Monte Castro", "Versalles", "Floresta",
                    "Vélez Sársfield", "Villa Luro", "Villa Gral Mitre", "Villa Devoto"};

            case "Catamarca":

                return new String[]{"San Fernando del Valle de Catamarca", "Valle Viejo", "Santa María", "Recreo", "Tinogasta", "Belén", "Andalgalá", "Fray Mamerto Esquiú"};

            case "Chaco":

                return new String[]{"Almirante Brown", "Bermejo", "Chacabuco", "Comandante Fernandez", "Doce De Octubre", "Dos De Abril", "Fray Justo Santa María De Oro", "Gral Belgrano", "Gral Donovan", "Gral Güemes",
                    "Independencia", "Libertad", "Libertador Gral San Martín", "Maipú", "Mayor Luís Jorge Fontana", "Nueve De Julio", "O`Higgins", "Pte De La Plaza", "Primero De Mayo", "Quitilipi", "San Fernando", "San Lorenzo",
                    "Sgto Cabral", "Tapenagá", "Veinticinco De Mayo/Qitilipí", "Veinticinco De Mayo"};

            case "Chubut":

                return new String[]{"Río Senguer", "Florentini Ameghino", "Cushamen", "Escalante", "Futaleufú", "Gaiman", "Tehuelches", "Paso De Indios", "Biedma", "Escalante", "Rawson", "Sarmiento", "Languiñeo", "Rawson"};

            case "Córdoba":

                return new String[]{"Río Cuarto", "Colón", "Juárez Celman", "Marco Juárez", "San Justo", "Tercero Arriba", "Santa María", "Unión", "Gral San Martín", "Punilla",
                    "Gral Roca", "Rìo Segundo", "Totoral", "Cruz Del Eje", "Capital", "Ischilín", "Calamuchita", "Pte Roque Sáenz Peña", "Río Primero", "San Javier", "Tulumba",
                    "San Alberto", "Pocho", "Minas", "Sobremonte", "Río Seco"};

            case "Corrientes":

                return new String[]{"Bella Vista", "Berón de Astrada", "Capital", "Concepción", "Curuzú Cuatiá", "Empedrado", "Esquina", "General Alvear", "General Paz", "Goya",
                    "Itatí", "Ituzaingó", "Lavalle", "Mburucuyá", "Mercedes", "Monte Caseros", "Paso de los Libres", "Saladas", "San Cosme", "San Luis del Palmar", "San Martín", "San Miguel", "San Roque", "Santo Tomé",
                    "Sauce"};

            case "Entre Ríos":

                return new String[]{"Colón", "Concordia", "Diamante", "Federación", "Federal", "Feliciano", "Gualeguay", "Gualeguaychú", "Islas del Ibicuy", "La Paz",
                    "Nogoyá", "Paraná", "San Salvador", "Tala", "Uruguay", "Victoria", "Villaguay"};

            case "Formosa":

                return new String[]{"Bermejo", "Formosa", "Laishí", "Matacos", "Patiño", "Pilagás", "Pilcomayo", "Pirané", "Ramón Lista"};

            case "Jujuy":

                return new String[]{"Cochinoca", "Dr. Manuel Belgrano", "El Carmen", "Humahuaca",
                    "Ledesma", "Palpalá", "Rinconada", "San Antonio", "San Pedro", "Santa Bárbara", "Santa CatalinaSusques", "	Tilcara", "Tumbaya", "Valle Grande", "Yaví"};

            case "La Pampa":

                return new String[]{"Atreucó", "Caleu Caleu", "Capital", "Catriló", "Chalileo", "Chapaleufú", "Chical Co", "Conhelo", "Curacó", "Guatraché", "Hucal", "Lihuel Calel", "Limay Mahuida", "Loventué", "Maracó", "Puelén", "Quemú Quemú", "RanculRealicóToay", "Trenel", "Utracá"};

            case "La Rioja":

                return new String[]{"AraucoCapital", "Castro Barros", "Chamical", "Chilecito", "Coronel Felipe Varela", "Famatina", "General Ángel V. Peñaloza", "General Belgrano", "General Juan Facundo Quiroga", "General Lamadrid", "General Ocampo", "General San Martín", "Independencia", "Rosario Vera Peñaloza", "San Blas de los Sauces", "Sanagasta", "Sanagasta"};

            case "Mendoza":

                return new String[]{"Capital", "Guaymallén", "Las Heras", "Lavalle", "Junín", "La Paz", "Maipú", "Rivadavia", "Santa Rosa", "San Martín", "Godoy Cruz", "Luján de Cuyo", "San Carlos", "Tunuyán", "Tupungato", "General Alvear", "Malargüe", "San Rafael"};

            case "Misiones":

                return new String[]{"Apóstoles", "Cainguás", "Candelaria", "Capital", "Concepción", "Eldorado", "General Manuel Belgrano", "Guaraní", "Leandro N. Alem", "Libertador General San Martín", "Montecarlo", "Oberá", "San Ignacio", "San Javier", "San Pedro", "25 de Mayo"};

            case "Neuquén":

                return new String[]{"Aluminé", "Añelo", "Catán Lil", "Chos Malal", "Collón Curá", "Confluencia",
                    " Huiliches", "Lácar", "Loncopué", "Los Lagos", "Minas", "Ñorquín", "Pehuenches", "Picún Leufú", "Picunches", " Zapala"};

            case "Río Negro":

                return new String[]{"Adolfo Alsina", "Avellaneda", "Bariloche", "Conesa", "El Cuy", "General Roca", "Nueve de Julio", "Ñorquincó", "Pichi Mahuida", "Pilcaniyeu", "San Antonio", "Valcheta", "Veinticinco de Mayo"};

            case "Salta":

                return new String[]{"Departamento de Anta", "Departamento de Cachi", "Departamento de Cafayate", "Departamento de la Capital", "Departamento de Cerrillos", "Departamento de Chicoana", "Departamento de General Güemes", "Departamento General José de San Martín", "	Departamento de Guachipas", "Departamento de Iruya", "Departamento de La Caldera", "Departamento de La Candelaria",
                    "Departamento La Poma", "Departamento La Viña", "Departamento de Los Andes", "Departamento de Metán", "Departamento de Molinos", "Departamento de Orán", "Departamento de Rivadavia", "Departamento de Rosario de la Frontera", "Departamento de Rosario de Lerma", "Departamento de San Carlos", ""
                    + "Departamento Santa Victoria"};

            case "San Juan":

                return new String[]{"Albardón", "Angaco", "Calingasta", "Capital", "Caucete", "Chimbas", "Iglesia", "Jáchal", "9 de julio", "Pocito",
                    "Rawson", "Rivadavia", "San Martín", "Santa Lucía", "Sarmiento", "Ullum", "Valle Fértil", "25 de mayo", "Zonda"};

            case "San Luis":

                return new String[]{"Ayacucho", "Belgrano", "Chacabuco", "Coronel Pringles", "General Pedernera", "Gobernador Dupuy", "Juan Martín de Pueyrredón", "Junín", "Libertador General San Martín", "San Luis"};

            case "Santa Cruz":

                return new String[]{"Río Gallegos", "Puerto Santa Cruz", "Río Turbio", "Veintiocho de Noviembre", "El Calafate", "Comandante Luis Piedrabuena",
                    "El Chaltén", "Puerto San Julián", "Gobernador Gregores", "Puerto Deseado", "Pico Truncado", "Los Antiguos", "Perito Moreno", "Las Heras", "Caleta Olivia"};

            case "Santa Fe":

                return new String[]{"Rosario", "La Capital", "General López", "General Obligado", "San Lorenzo", "Las Colonias", "Constitución", "Caseros",
                    "San Jerónimo", "San Cristóbal", "Iriondo", "San Martín", "Vera", "Belgrano", "San Justo", "San Javier", "9 de Julio", "Garay"};

            case "Santiago del Estero":

                return new String[]{"Aguirre", "Alberdi", "Atamisqui", "Avellaneda", "Banda", "Belgrano", "Choya", "Copo", "Figueroa", "General Taboada",
                    "Guasayán", "Jiménez", "Juan Felipe Ibarra", "Juan Francisco Borges", "Loreto", "Mitre", "Moreno", "Ojo de Agua", "Pellegrini", "Quebrachos",
                    "Río Hondo", "Rivadavia", "Robles", "Salavina","Santiago del Estero, Capital", "San Martín", "Sarmiento", "Silípica"};

            case "Tierra del Fuego, Antártida e Islas del Atlántico Sur":

                return new String[]{"Antártida Argentina", "Islas del Atlántico Sur", "Río Grande", "Tolhuin", "Ushuaia"};

            case "Tucumán":

                return new String[]{"Burruyacú", "Capital", "Cruz Alta", "Chicligasta", "Famaillá", "Graneros", "Juan Bautista Alberdi", "La Cocha", "Leales", "Monteros",
                    "Río Chico", "Simoca", "Tafí del Valle", "Tafí Viejo", "Trancas", "Yerba Buena"};

            default:
                return new String[0];
        }
    }
}
