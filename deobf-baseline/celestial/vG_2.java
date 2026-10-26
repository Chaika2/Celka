package celestial;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vG_2 extends vm_3 {
   private static final Logger id_throws = LogManager.getLogger();
   private final Av_1 id_case = new Av_1();
   private final vm_3 id_catch;
   protected vF_2 id_class;
   private AQ id_private;
   private LF id_implements;
   private LF id_finally;
   private LF id_else;
   private List<rgP_2> id_synchronized;
   private Ak_1 id_return;
   private Am_1 id_public;
   private Au_1 id_goto;
   private boolean id_while;

   private void id_byte(boolean var1) {
      vL_2 var2 = this.id_class.id_finally();
      if (var1 && var2 instanceof vC_2 var3) {
         this.id_private.id_class(var3.id_break());
         this.id_private.id_break();
         this.id_class.id_class(null);
         this.id_class.id_class(this.id_private);
      }

      this.id_volatile.id_break(this);
   }

   private void id_int() {
      this.id_volatile.id_break(new vG_2(this.id_catch));
   }

   public vG_2(vm_3 var1) {
      super(new rgn_3("multiplayer.title"));
      this.id_catch = var1;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (super.id_class(var1, var2, var3)) {
         return true;
      } else if (var1 == 294) {
         this.id_int();
         return true;
      } else if (this.id_class.id_finally() != null) {
         if (var1 != 257 && var1 != 335) {
            return this.id_class.id_class(var1, var2, var3);
         } else {
            this.id_finally();
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_synchronized = null;
      this.id_class(var1);
      this.id_class.id_class(var1, var2, var3, var4);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 20, 16777215);
      super.id_class(var1, var2, var3, var4);
      if (this.id_synchronized != null) {
         this.id_class(var1, this.id_synchronized, var2, var3);
      }
   }

   private void id_class(Ak_1 var1) {
      this.id_volatile.id_break(new mt_3(this, this.id_volatile, var1));
   }

   public void id_class(List<rgP_2> var1) {
      this.id_synchronized = var1;
   }

   public void id_class(vL_2 var1) {
      this.id_class.id_class(var1);
      this.id_native();
   }

   private void id_throws(boolean var1) {
      if (var1) {
         this.id_private.id_break(this.id_return);
         this.id_private.id_break();
         this.id_class.id_class(null);
         this.id_class.id_class(this.id_private);
      }

      this.id_volatile.id_break(this);
   }

   public void id_finally() {
      vL_2 var1 = this.id_class.id_finally();
      if (var1 instanceof vC_2) {
         this.id_class(((vC_2)var1).id_break());
      } else if (var1 instanceof vA_2) {
         AZ var2 = ((vA_2)var1).id_class();
         this.id_class(new Ak_1(var2.id_class(), var2.id_break(), true));
      }
   }

   private void id_case(boolean var1) {
      if (var1) {
         this.id_class(this.id_return);
      } else {
         this.id_volatile.id_break(this);
      }
   }

   public AQ id_package() {
      return this.id_private;
   }

   private void id_protected(boolean var1) {
      vL_2 var2 = this.id_class.id_finally();
      if (var1 && var2 instanceof vC_2) {
         Ak_1 var3 = ((vC_2)var2).id_break();
         var3.id_class = this.id_return.id_class;
         var3.id_break = this.id_return.id_break;
         var3.id_class(this.id_return);
         this.id_private.id_break();
         this.id_class.id_class(this.id_private);
      }

      this.id_volatile.id_break(this);
   }

   @Override
   public void id_private() {
      super.id_private();
      if (this.id_public.id_class()) {
         List var1 = this.id_public.id_byte();
         this.id_public.id_break();
         this.id_class.id_class(var1);
      }

      this.id_case.id_class();
   }

   public Av_1 id_final() {
      return this.id_case;
   }

   protected void id_native() {
      this.id_finally.id_int = false;
      this.id_implements.id_int = false;
      this.id_else.id_int = false;
      vL_2 var1 = this.id_class.id_finally();
      if (var1 != null && !(var1 instanceof vn_3)) {
         this.id_finally.id_int = true;
         if (var1 instanceof vC_2 var2) {
            this.id_implements.id_int = true;
            if (var2.id_break() instanceof rrwp_3) {
               this.id_else.id_int = false;
            } else {
               this.id_else.id_int = true;
            }
         }
      }
   }

   @Override
   protected void v_() {
      super.v_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      if (this.id_while) {
         this.id_class.id_break(this.id_package, this.id_int, 32, this.id_int - 64);
      } else {
         this.id_while = true;
         this.id_private = new AQ(this.id_volatile);
         this.id_private.id_class();
         this.id_public = new Am_1();

         try {
            this.id_goto = new Au_1(this.id_public);
            this.id_goto.start();
         } catch (Exception var2) {
            id_throws.warn("Unable to start LAN server detection: {}", var2.getMessage());
         }

         this.id_class = new vF_2(this, this.id_volatile, this.id_package, this.id_int, 32, this.id_int - 64, 36);
         this.id_class.id_class(this.id_private);
      }

      rrwm_3.id_class(this);
      this.id_native.add(this.id_class);
      this.id_finally = this.id_class(
         (LF)(new LF(this.id_package / 2 - 154, this.id_int - 52, 100, 20, new rgn_3("selectServer.select"), var1 -> this.id_finally()))
      );
      this.id_class((LF)(new LF(this.id_package / 2 - 50, this.id_int - 52, 100, 20, new rgn_3("selectServer.direct"), var1 -> {
         this.id_return = new Ak_1(jI_2.id_class("selectServer.defaultName"), "", false);
         this.id_volatile.id_break(new vv_3(this, this::id_case, this.id_return));
      })));
      this.id_class((LF)(new LF(this.id_package / 2 + 4 + 50, this.id_int - 52, 100, 20, new rgn_3("selectServer.add"), var1 -> {
         this.id_return = new Ak_1(jI_2.id_class("selectServer.defaultName"), "", false);
         this.id_volatile.id_break(new mz_3(this, this::id_throws, this.id_return));
      })));
      this.id_implements = this.id_class((LF)(new LF(this.id_package / 2 - 154, this.id_int - 28, 70, 20, new rgn_3("selectServer.edit"), var1 -> {
         vL_2 var2x = this.id_class.id_finally();
         if (var2x instanceof vC_2) {
            Ak_1 var3 = ((vC_2)var2x).id_break();
            if (var3 instanceof rrwp_3 var4) {
               this.id_return = var4.id_catch();
               this.id_return.id_class(var4);
            } else {
               this.id_return = new Ak_1(var3.id_class, var3.id_break, false);
               this.id_return.id_class(var3);
            }

            this.id_volatile.id_break(new mz_3(this, this::id_protected, this.id_return));
         }
      })));
      this.id_else = this.id_class((LF)(new LF(this.id_package / 2 - 74, this.id_int - 28, 70, 20, new rgn_3("selectServer.delete"), var1 -> {
         vL_2 var2x = this.id_class.id_finally();
         if (var2x instanceof vC_2) {
            String var3 = ((vC_2)var2x).id_break().id_class;
            if (var3 != null) {
               rgn_3 var4 = new rgn_3("selectServer.deleteQuestion");
               rgn_3 var5 = new rgn_3("selectServer.deleteWarning", var3);
               rgn_3 var6 = new rgn_3("selectServer.deleteButton");
               rgP_2 var7 = cN_2.id_protected;
               this.id_volatile.id_break(new mT_2(this::id_byte, var4, var5, var6, var7));
            }
         }
      })));
      this.id_class((LF)(new LF(this.id_package / 2 + 4, this.id_int - 28, 70, 20, new rgn_3("selectServer.refresh"), var1 -> this.id_int())));
      this.id_class((LF)(new LF(this.id_package / 2 + 4 + 76, this.id_int - 28, 75, 20, cN_2.id_protected, var1 -> this.id_volatile.id_break(this.id_catch))));
      this.id_class(rrjC_2.id_protected().id_byte());
      this.id_native();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
      if (this.id_goto != null) {
         this.id_goto.interrupt();
         this.id_goto = null;
      }

      this.id_case.id_break();
   }
}
