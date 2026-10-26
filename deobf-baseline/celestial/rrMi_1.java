package celestial;

import java.util.ArrayList;

public abstract class rrMi_1 {
   private rrWQ<aI_2, ryW_2> id_class;
   private String id_break;
   private float id_byte;
   private String[] id_protected;

   public String[] id_byte() {
      return this.id_protected;
   }

   public rrMi_1(ryW_2 var1, String var2, float var3, String[] var4) {
      this(rrWQ.id_break(var1), var2, var3, var4);
   }

   public rrMi_1(rrWQ<aI_2, ryW_2> var1, String var2, float var3, String[] var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public rrMi_1(aI_2 var1, String var2, float var3) {
      this(rrWQ.id_class(var1), var2, var3, (String[])null);
   }

   public rrMi_1(ryW_2 var1, String var2, float var3) {
      this(rrWQ.id_break(var1), var2, var3, (String[])null);
   }

   public rrMi_1(aI_2 var1, String var2, float var3, String[] var4) {
      this(rrWQ.id_class(var1), var2, var3, var4);
   }

   public Iq_1[] id_class(In_1 var1) {
      String[] var2 = this.id_case();
      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < var2.length; var4++) {
         String var5 = var2[var4];
         Iq_1 var6 = this.id_class(var1, var5);
         if (var6 != null) {
            var3.add(var6);
         }
      }

      return var3.toArray(new Iq_1[var3.size()]);
   }

   public abstract Iq_1 id_class(In_1 var1, String var2);

   public abstract rrMa_1 id_class(In_1 var1, float var2);

   public rrWQ<aI_2, ryW_2> id_class() {
      return this.id_class;
   }

   public String id_break() {
      return this.id_break;
   }

   public abstract In_1 id_throws();

   public abstract String[] id_case();

   public float id_protected() {
      return this.id_byte;
   }
}
