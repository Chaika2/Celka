package celestial;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.IDN;
import java.util.function.Predicate;

public class mz_3 extends vm_3 {
   private static final rgP_2 id_class = new rgn_3("addServer.enterName");
   private static final rgP_2 id_throws = new rgn_3("addServer.enterIp");
   private LF id_case;
   private final BooleanConsumer id_catch;
   private final Ak_1 id_private;
   private Lu_1 id_implements;
   private Lu_1 id_finally;
   private LF id_else;
   private final vm_3 id_synchronized;
   private final Predicate<String> id_return = var0 -> {
      if (rql_3.id_break(var0)) {
         return true;
      } else {
         String[] var1x = var0.split(":");
         if (var1x.length == 0) {
            return true;
         } else {
            try {
               String var2x = IDN.toASCII(var1x[0]);
               return true;
            } catch (IllegalArgumentException var3x) {
               return false;
            }
         }
      }
   };

   public mz_3(vm_3 var1, BooleanConsumer var2, Ak_1 var3) {
      super(new rgn_3("addServer.title"));
      this.id_synchronized = var1;
      this.id_catch = var2;
      this.id_private = var3;
   }

   private static rgP_2 id_class(Az_1 var0) {
      return new rgn_3("addServer.resourcePack").id_break(": ").id_class(var0.id_class());
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if ((var1 == 257 || var1 == 335) && this.id_case.id_int) {
         this.id_finally();
         return true;
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 17, 16777215);
      id_break(var1, this.id_super, id_class, this.id_package / 2 - 100, 53, 10526880);
      id_break(var1, this.id_super, id_throws, this.id_package / 2 - 100, 94, 10526880);
      this.id_finally.id_class(var1, var2, var3, var4);
      this.id_implements.id_class(var1, var2, var3, var4);
      super.id_class(var1, var2, var3, var4);
   }

   private void id_class(String var1) {
      this.id_native();
   }

   @Override
   public void id_class(QY var1, int var2, int var3) {
      String var4 = this.id_implements.id_private();
      String var5 = this.id_finally.id_private();
      this.id_break(var1, var2, var3);
      this.id_implements.id_class(var4);
      this.id_finally.id_class(var5);
   }

   private void id_finally() {
      this.id_private.id_class = this.id_finally.id_private();
      this.id_private.id_break = this.id_implements.id_private();
      this.id_catch.accept(true);
   }

   @Override
   public void id_private() {
      this.id_finally.id_catch();
      this.id_implements.id_catch();
   }

   @Override
   public void id_volatile() {
      this.id_native();
      this.id_volatile.id_break(this.id_synchronized);
   }

   private void id_native() {
      String var1 = this.id_implements.id_private();
      boolean var2 = !var1.isEmpty() && var1.split(":").length > 0 && var1.indexOf(32) == -1;
      this.id_case.id_int = var2 && !this.id_finally.id_private().isEmpty();
      if (this.id_private instanceof rrwp_3) {
         this.id_implements.id_case(false);
         this.id_implements.id_byte(false);
         this.id_finally.id_case(false);
         this.id_finally.id_byte(false);
      }
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      this.id_finally = new Lu_1(this.id_super, this.id_package / 2 - 100, 66, 200, 20, new rgn_3("addServer.enterName"));
      this.id_finally.id_byte(true);
      this.id_finally.id_class(this.id_private.id_class);
      this.id_finally.id_class(this::id_class);
      this.id_native.add(this.id_finally);
      this.id_implements = new Lu_1(this.id_super, this.id_package / 2 - 100, 106, 200, 20, new rgn_3("addServer.enterIp"));
      this.id_implements.id_implements(128);
      this.id_implements.id_class(this.id_private.id_break);
      this.id_implements.id_class(this.id_return);
      this.id_implements.id_class(this::id_class);
      this.id_native.add(this.id_implements);
      this.id_else = this.id_class((LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 72, 200, 20, id_class(this.id_private.id_break()), var1 -> {
         this.id_private.id_class(Az_1.values()[(this.id_private.id_break().ordinal() + 1) % Az_1.values().length]);
         this.id_else.id_break(id_class(this.id_private.id_break()));
      })));
      this.id_case = this.id_class(
         (LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 96 + 18, 200, 20, new rgn_3("addServer.add"), var1 -> this.id_finally()))
      );
      this.id_class((LF)(new LF(this.id_package / 2 - 100, this.id_int / 4 + 120 + 18, 200, 20, cN_2.id_protected, var1 -> this.id_catch.accept(false))));
      this.id_native();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
