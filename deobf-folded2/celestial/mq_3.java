package celestial;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class mq_3 extends mT_2 {
   private final rgP_2 id_catch;
   private final rgP_2 id_private;
   private final String id_implements;
   private final boolean id_finally;

   public mq_3(BooleanConsumer var1, String var2, boolean var3) {
      super(var1, new rgn_3(var3 ? "chat.link.confirmTrusted" : "chat.link.confirm"), new rgN_2(var2));
      this.id_class = (rgP_2)(var3 ? new rgn_3("chat.link.open") : cN_2.id_throws);
      this.id_throws = var3 ? cN_2.id_protected : cN_2.id_case;
      this.id_private = new rgn_3("chat.copy");
      this.id_catch = new rgn_3("chat.link.warning");
      this.id_finally = !var3;
      this.id_implements = var2;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      super.id_class(var1, var2, var3, var4);
      if (this.id_finally) {
         id_class(var1, this.id_super, this.id_catch, this.id_package / 2, 110, 16764108);
      }
   }

   public void id_finally() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(this.id_implements);
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_new.clear();
      this.id_native.clear();
      this.id_class(new LF(this.id_package / 2 - 50 - 105, this.id_int / 6 + 96, 100, 20, this.id_class, var1 -> this.id_case.accept(true)));
      this.id_class(new LF(this.id_package / 2 - 50, this.id_int / 6 + 96, 100, 20, this.id_private, var1 -> {
         this.id_finally();
         this.id_case.accept(false);
      }));
      this.id_class(new LF(this.id_package / 2 - 50 + 105, this.id_int / 6 + 96, 100, 20, this.id_throws, var1 -> this.id_case.accept(false)));
   }
}
