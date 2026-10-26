package celestial;

public abstract class rkv_3 implements rkw_3<rXu_1> {
   protected final rkj_3<?> id_class;
   protected final rqO_2 id_break;
   protected final String id_byte;
   protected final rkg_3 id_protected;
   protected final rdn_3 id_throws;
   protected final float id_case;
   protected final int id_catch;

   @Override
   public rdn_3 id_byte() {
      return this.id_throws;
   }

   public rkv_3(rkj_3<?> var1, rqO_2 var2, String var3, rkg_3 var4, rdn_3 var5, float var6, int var7) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return true;
   }

   @Override
   public rqs_3<rkg_3> id_class() {
      rqs_3 var1 = rqs_3.id_class();
      var1.add(this.id_protected);
      return var1;
   }

   @Override
   public boolean id_class(rXu_1 var1, rYB var2) {
      return this.id_protected.id_class(var1.id_extends(0));
   }

   @Override
   public rdn_3 id_class(rXu_1 var1) {
      return this.id_throws.id_implements();
   }

   public float id_break() {
      return this.id_case;
   }

   public int id_throws() {
      return this.id_catch;
   }

   @Override
   public rkj_3<?> id_catch() {
      return this.id_class;
   }

   @Override
   public rqO_2 id_case() {
      return this.id_break;
   }

   @Override
   public String id_protected() {
      return this.id_byte;
   }
}
