/*

Declaramos una entidad: esto significa que queremos persistir el objeto en
un repositorio (BD)
@Entity 
public class Entidad {

    @Id : declaramos la clave primaria
    
    Declaramos como queremos inicializar la clave primaria: automatico o manual
    En este caso usamos un generador de clave 
    @GeneratedValue(generator = "uuid")
    
    Declaramos el generador de clave ?nica que usa la estrateg?a uuid2
    @GenericGenerator(name = "uuid", strategy = "uuid2")

    Para mapear atributos tipo Enum
    @Enumerated(EnumType.ORIGIN) : cuando es una numeraci?n
    @Enumerated(EnumType.STRING) 
    
    Para mapear atributos tipo DATE
    @Temporal(TemporalType.DATE)
    @Temporal(TemporalType.TIME)
    @Temporal(TemporalType.TIMESTAMP) : fecha + hora

    Para mapear un atributo que contiene un objeto pesado usamos @Lob
    En general atributos tipo arreglo de bytes: byte[]
    Para indicar que no se cargue el atributo por defecto usamos @Basic
    para acceder al atributo usamos un get, esto se hace para alivianar las 
    querys
    @Lob @Basic(fetch = FetchType.LAZY)

    RELACIONALES
    @OneToOne
    @ManyToOne
    @OneToMany
    @ManyToMany

    --Se agregan Getters y Setters--
}

*/