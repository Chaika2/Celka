package celestial;

public class vA_2 extends vL_2 {
   private static final rgP_2 id_byte = new rgn_3("lanServer.title");
   private static final rgP_2 id_protected = new rgn_3("selectServer.hiddenAddress");
   private final vG_2 id_throws;
   protected final QY id_class;
   protected final AZ id_break;
   private long id_case;

   protected vA_2(vG_2 var1, AZ var2) {
      this.id_throws = var1;
      this.id_break = var2;
      this.id_class = QY.id_instanceof();
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      ((cm_3)this.id_class.id_class[15]).id_byte(var1, id_byte, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      ((cm_3)this.id_class.id_class[15]).id_break(var1, this.id_break.id_class(), (float)(var4 + 32 + 3), (float)(var3 + 12), 8421504);
      if (((Qw_1)this.id_class.id_class[20]).id_package) {
         ((cm_3)this.id_class.id_class[15]).id_byte(var1, id_protected, (float)(var4 + 32 + 3), (float)(var3 + 12 + 11), 3158064);
      } else {
         ((cm_3)this.id_class.id_class[15]).id_break(var1, this.id_break.id_break(), (float)(var4 + 32 + 3), (float)(var3 + 12 + 11), 3158064);
      }
   }

   public AZ id_class() {
      return this.id_break;
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      this.id_throws.id_class(this);
      if (rqR_2.id_break() - this.id_case < 250L) {
         this.id_throws.id_finally();
      }

      this.id_case = rqR_2.id_break();
      return false;
   }
}
