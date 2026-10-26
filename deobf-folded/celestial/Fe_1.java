package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Locale;
import java.util.UUID;
import java.util.stream.Collectors;

public class Fe_1 extends vm_3 {
   protected static final rqO_2 id_class = new rqO_2("textures/gui/social_interactions.png");
   private static final rgP_2 id_throws = new rgn_3("gui.socialInteractions.tab_all");
   private static final rgP_2 id_case = new rgn_3("gui.socialInteractions.tab_hidden");
   private static final rgP_2 id_catch = new rgn_3("gui.socialInteractions.tab_blocked");
   private static final rgP_2 id_private = id_throws.id_throws().id_class(rgF_2.UNDERLINE);
   private static final rgP_2 id_implements = id_case.id_throws().id_class(rgF_2.UNDERLINE);
   private static final rgP_2 id_finally = id_catch.id_throws().id_class(rgF_2.UNDERLINE);
   private static final rgP_2 id_else = new rgn_3("gui.socialInteractions.search_hint").id_class(rgF_2.ITALIC).id_class(rgF_2.GRAY);
   static final rgP_2 id_synchronized = new rgn_3("gui.socialInteractions.search_empty").id_class(rgF_2.GRAY);
   private static final rgP_2 id_return = new rgn_3("gui.socialInteractions.empty_hidden").id_class(rgF_2.GRAY);
   private static final rgP_2 id_public = new rgn_3("gui.socialInteractions.empty_blocked").id_class(rgF_2.GRAY);
   private static final rgP_2 id_goto = new rgn_3("gui.socialInteractions.blocking_hint");
   FY id_while;
   Lu_1 id_try;
   private String id_instanceof = "";
   private Lr_1 id_throw = Lr_1.ALL;
   private LF id_interface;
   private LF id_char;
   private LF id_abstract;
   private LF id_long;
   private rgP_2 id_float;
   private int id_boolean;
   private boolean id_transient;
   private Runnable id_for;

   public Fe_1() {
      super(new rgn_3("gui.socialInteractions.title"));
      this.id_class(QY.id_instanceof());
   }

   public void id_class(Aw_1 var1) {
      this.id_while.id_class(var1, this.id_throw);
   }

   private void id_class(QY var1) {
      int var2 = var1.id_void().id_throws().size();
      if (this.id_boolean != var2) {
         String var3 = "";
         Ak_1 var4 = var1.S();
         if (var1.id_switch()) {
            var3 = var1.id_this().h();
         } else if (var4 != null) {
            var3 = var4.id_class;
         }

         if (var2 > 1) {
            this.id_float = new rgn_3("gui.socialInteractions.server_label.multiple", var3, var2);
         } else {
            this.id_float = new rgn_3("gui.socialInteractions.server_label.single", var3, var2);
         }

         this.id_boolean = var2;
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (!this.id_try.aO_() && ((Qw_1)this.id_volatile.id_class[20]).A.id_class(var1, var2)) {
         this.id_volatile.id_break((vm_3)null);
         return true;
      } else {
         return super.id_class(var1, var2, var3);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(this.id_volatile);
      this.id_class(var1);
      if (this.id_float != null) {
         id_break(var1, (cm_3)this.id_volatile.id_class[15], this.id_float, this.id_package() + 8, 35, -1);
      }

      if (!this.id_while.id_private()) {
         this.id_while.id_class(var1, var2, var3, var4);
      } else if (!this.id_try.id_private().isEmpty()) {
         id_class(var1, (cm_3)this.id_volatile.id_class[15], id_synchronized, this.id_package / 2, (78 + this.id_final()) / 2, -1);
      } else {
         switch (this.id_throw) {
            case HIDDEN:
               id_class(var1, (cm_3)this.id_volatile.id_class[15], id_return, this.id_package / 2, (78 + this.id_final()) / 2, -1);
               break;
            case BLOCKED:
               id_class(var1, (cm_3)this.id_volatile.id_class[15], id_public, this.id_package / 2, (78 + this.id_final()) / 2, -1);
         }
      }

      if (!this.id_try.aO_() && this.id_try.id_private().isEmpty()) {
         id_break(var1, (cm_3)this.id_volatile.id_class[15], id_else, this.id_try.id_volatile, this.id_try.id_final, -1);
      } else {
         this.id_try.id_class(var1, var2, var3, var4);
      }

      this.id_long.id_new = this.id_throw == Lr_1.BLOCKED;
      super.id_class(var1, var2, var3, var4);
      if (this.id_for != null) {
         this.id_for.run();
      }
   }

   public void id_class(UUID var1) {
      this.id_while.id_class(var1);
   }

   public void id_class(Runnable var1) {
      this.id_for = var1;
   }

   private void id_class(String var1) {
      var1 = var1.toLowerCase(Locale.ROOT);
      if (!var1.equals(this.id_instanceof)) {
         this.id_while.id_class(var1);
         this.id_instanceof = var1;
         this.id_class(this.id_throw);
      }
   }

   private void id_class(Lr_1 var1) {
      this.id_throw = var1;
      this.id_interface.id_break(id_throws);
      this.id_char.id_break(id_case);
      this.id_abstract.id_break(id_catch);

      Object var2 = switch (var1) {
         case ALL -> {
            this.id_interface.id_break(id_private);
            yield ((Aq_1)((cb_3)this.id_volatile.id_class[57]).id_break[0]).id_case();
         }
         case HIDDEN -> {
            this.id_char.id_break(id_implements);
            yield this.id_volatile.id_volatile().id_class();
         }
         case BLOCKED -> {
            this.id_abstract.id_break(id_finally);
            FU var3 = this.id_volatile.id_volatile();
            yield ((Aq_1)((cb_3)this.id_volatile.id_class[57]).id_break[0]).id_case().stream().filter(var3::id_throws).collect(Collectors.toSet());
         }
         default -> ImmutableList.of();
      };
      this.id_throw = var1;
      this.id_while.id_class((Collection<UUID>)var2, this.id_while.id_package());
   }

   @Override
   public void id_class(Ml_1 var1) {
      int var2 = this.id_package() + 3;
      super.id_class(var1);
      this.id_volatile.A().id_class(id_class);
      this.id_break(var1, var2, 64, 1, 1, 236, 8);
      int var3 = this.id_native();

      for (int var4 = 0; var4 < var3; var4++) {
         this.id_break(var1, var2, 72 + 16 * var4, 1, 10, 236, 16);
      }

      this.id_break(var1, var2, 72 + 16 * var3, 1, 27, 236, 8);
      this.id_break(var1, var2 + 10, 76, 243, 1, 12, 12);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (this.id_try.aO_()) {
         this.id_try.id_break(var1, var3, var5);
      }

      return super.id_break(var1, var3, var5) || this.id_while.id_break(var1, var3, var5);
   }

   private int id_finally() {
      return Math.max(52, this.id_int - 128 - 16);
   }

   private int id_package() {
      return (this.id_package - 238) / 2;
   }

   @Override
   public void id_private() {
      super.id_private();
      this.id_try.id_catch();
   }

   private int id_final() {
      return 80 + this.id_native() * 16 - 8;
   }

   private int id_native() {
      return this.id_finally() / 16;
   }

   @Override
   public String D_() {
      return super.D_() + ". " + this.id_float.getString();
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      if (this.id_transient) {
         this.id_while.id_break(this.id_package, this.id_int, 88, this.id_final());
      } else {
         this.id_while = new FY(this, this.id_volatile, this.id_package, this.id_int, 88, this.id_final(), 36);
      }

      int var1 = this.id_while.F_() / 3;
      int var2 = this.id_while.id_continue();
      int var3 = this.id_while.id_super();
      int var4 = this.id_super.id_class(id_goto) + 40;
      int var5 = 64 + 16 * this.id_native();
      int var6 = (this.id_package - var4) / 2;
      this.id_interface = this.id_class((LF)(new LF(var2, 45, var1, 20, id_throws, var1x -> this.id_class(Lr_1.ALL))));
      this.id_char = this.id_class((LF)(new LF((var2 + var3 - var1) / 2 + 1, 45, var1, 20, id_case, var1x -> this.id_class(Lr_1.HIDDEN))));
      this.id_abstract = this.id_class((LF)(new LF(var3 - var1 + 1, 45, var1, 20, id_catch, var1x -> this.id_class(Lr_1.BLOCKED))));
      this.id_long = this.id_class((LF)(new LF(var6, var5, var4, 20, id_goto, var1x -> this.id_volatile.id_break(new mq_3(var1xx -> {
            if (var1xx) {
               rqR_2.id_implements().id_class("https://aka.ms/javablocking");
            }

            this.id_volatile.id_break(this);
         }, "https://aka.ms/javablocking", true)))));
      String var7 = this.id_try != null ? this.id_try.id_private() : "";
      this.id_try = new Fa_1(this, this.id_super, this.id_package() + 28, 78, 196, 16, id_else);
      this.id_try.id_implements(16);
      this.id_try.id_protected(false);
      this.id_try.id_private(true);
      this.id_try.id_finally(16777215);
      this.id_try.id_class(var7);
      this.id_try.id_class(this::id_class);
      this.id_native.add(this.id_try);
      this.id_native.add(this.id_while);
      this.id_transient = true;
      this.id_class(this.id_throw);
   }

   @Override
   public boolean z_() {
      return false;
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
