package celestial;

public abstract class rWx_1 implements rkw_3<rXu_1> {
   protected final rkg_3 id_class;
   protected final rdn_3 id_break;
   private final rkj_3<?> id_throws;
   private final rkf_3<?> id_case;
   protected final rqO_2 id_byte;
   protected final String id_protected;

   @Override
   public rdn_3 id_byte() {
      return this.id_break;
   }

   public rWx_1(rkj_3<?> var1, rkf_3<?> var2, rqO_2 var3, String var4, rkg_3 var5, rdn_3 var6) {
      this.id_throws = var1;
      this.id_case = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_class = var5;
      this.id_break = var6;
   }

   @Override
   public rdn_3 id_class(rXu_1 var1) {
      return this.id_break.id_implements();
   }

   @Override
   public rqs_3<rkg_3> id_class() {
      rqs_3 var1 = rqs_3.id_class();
      var1.add(this.id_class);
      return var1;
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return true;
   }

   @Override
   public rkj_3<?> id_catch() {
      return this.id_throws;
   }

   @Override
   public rqO_2 id_case() {
      return this.id_byte;
   }

   @Override
   public String id_protected() {
      return this.id_protected;
   }

   @Override
   public rkf_3<?> W_() {
      return this.id_case;
   }
}
