package celestial;

public class vH_2 extends vm_3 {
   private static final rgP_2 id_class = new rgn_3("selectWorld.allowCommands");
   private static final rgP_2 id_throws = new rgn_3("selectWorld.gameMode");
   private static final rgP_2 id_case = new rgn_3("lanServer.otherPlayers");
   private final vm_3 id_catch;
   private LF id_private;
   private LF id_implements;
   private String id_finally = "survival";
   private boolean id_else;

   public vH_2(vm_3 var1) {
      super(new rgn_3("lanServer.title"));
      this.id_catch = var1;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 50, 16777215);
      id_class(var1, this.id_super, id_case, this.id_package / 2, 82, 16777215);
      super.id_class(var1, var2, var3, var4);
   }

   private void id_finally() {
      this.id_implements.id_break(new rgn_3("options.generic_value", id_throws, new rgn_3("selectWorld.gameMode." + this.id_finally)));
      this.id_private.id_break(cN_2.id_class(id_class, this.id_else));
   }

   @Override
   protected void v_() {
      this.id_class(new LF(this.id_package / 2 - 155, this.id_int - 28, 150, 20, new rgn_3("lanServer.start"), var1 -> {
         this.id_volatile.id_break((vm_3)null);
         int var2 = rpu_3.id_class();
         rgn_3 var3;
         if (this.id_volatile.id_this().id_class(rRl_1.id_class(this.id_finally), this.id_else, var2)) {
            var3 = new rgn_3("commands.publish.started", var2);
         } else {
            var3 = new rgn_3("commands.publish.failed");
         }

         ((cq_3)this.id_volatile.id_class[19]).id_throws().id_class(var3);
         this.id_volatile.id_implements();
      }));
      this.id_class(new LF(this.id_package / 2 + 5, this.id_int - 28, 150, 20, cN_2.id_protected, var1 -> this.id_volatile.id_break(this.id_catch)));
      this.id_implements = this.id_class(new LF(this.id_package / 2 - 155, 100, 150, 20, rgN_2.id_byte, var1 -> {
         if ("spectator".equals(this.id_finally)) {
            this.id_finally = "creative";
         } else if ("creative".equals(this.id_finally)) {
            this.id_finally = "adventure";
         } else if ("adventure".equals(this.id_finally)) {
            this.id_finally = "survival";
         } else {
            this.id_finally = "spectator";
         }

         this.id_finally();
      }));
      this.id_private = this.id_class(new LF(this.id_package / 2 + 5, 100, 150, 20, id_class, var1 -> {
         this.id_else = !this.id_else;
         this.id_finally();
      }));
      this.id_finally();
   }
}
