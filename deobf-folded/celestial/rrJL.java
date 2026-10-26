package celestial;

import java.util.LinkedHashMap;
import java.util.Map;

public class rrJL {
   private int id_class = 0;
   private String id_break = null;
   private Map<String, String> id_byte = new LinkedHashMap<>();
   private byte[] id_protected = null;

   public Map id_byte() {
      return this.id_byte;
   }

   public rrJL(int var1, String var2, Map var3, byte[] var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public String id_class(String var1) {
      return this.id_byte.get(var1);
   }

   public int id_class() {
      return this.id_class;
   }

   public String id_break() {
      return this.id_break;
   }

   public byte[] id_protected() {
      return this.id_protected;
   }
}
