package celestial;

public class rnP_2 {
   private final rns_3 id_class;
   private final String id_break;
   private final rAi_1 id_byte;
   private rgP_2 id_protected;
   private rgP_2 id_throws;
   private rnr_3 id_case;

   public rAi_1 id_byte() {
      return this.id_byte;
   }

   public rnP_2(rns_3 var1, String var2, rAi_1 var3, rgP_2 var4, rnr_3 var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = this.id_catch();
      this.id_case = var5;
   }

   public void id_class(rgP_2 var1) {
      this.id_protected = var1;
      this.id_throws = this.id_catch();
      this.id_class.id_throws(this);
   }

   public void id_class(rnr_3 var1) {
      this.id_case = var1;
      this.id_class.id_throws(this);
   }

   public rns_3 id_class() {
      return this.id_class;
   }

   public String id_break() {
      return this.id_break;
   }

   public rgP_2 id_throws() {
      return this.id_throws;
   }

   private rgP_2 id_catch() {
      return rgv_3.id_class((rgP_2)this.id_protected.id_case().id_class(var1 -> var1.id_class(new rgy_3(rgp_3.id_class, new rgN_2(this.id_break)))));
   }

   public rnr_3 id_case() {
      return this.id_case;
   }

   public rgP_2 id_protected() {
      return this.id_protected;
   }
}
