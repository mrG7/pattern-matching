/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package influent.idl;  
@SuppressWarnings("all")
/** Temporal resolution for aggregation */
@org.apache.avro.specific.AvroGenerated
public enum FL_DateInterval { 
  DAILY, WEEKLY, MONTHLY, QUARTERLY, YEARLY  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"FL_DateInterval\",\"namespace\":\"influent.idl\",\"doc\":\"Temporal resolution for aggregation\",\"symbols\":[\"DAILY\",\"WEEKLY\",\"MONTHLY\",\"QUARTERLY\",\"YEARLY\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}