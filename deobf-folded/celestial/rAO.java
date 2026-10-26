package celestial;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nonnull;

public final class rAO extends vk_3 {
   private static final rgP_2 id_implements = new rgN_2("A-Z");
   private static final rgP_2 id_finally = new rgN_2("Z-A");
   private static final rgP_2 id_else = new rgn_3("refresh");
   private final rAw_1 id_synchronized = new rAw_1(this::id_native);
   private Comparator<Ar_1> id_return;
   private Li_1 id_public;
   private rAM id_goto;
   private Lu_1 id_while;

   public rAO(vk_3 var1) {
      super(var1.id_throws, var1.id_class.id_class, var1.id_class.id_byte, var1.id_private, var1.id_new());
      vh_3 var2 = var1.id_class;
      Runnable var3 = var2.id_break;
      var2.id_break = () -> {
         var3.run();
         this.id_native();
      };
   }

   @Override
   public void id_class(@Nonnull Li_1 var1, @Nonnull Stream<vd_3> var2) {
      super.id_class(var1, var2);
      if (this.id_public != null) {
         this.id_native();
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_protected(0);
      this.id_catch.id_class(var1, var2, var3, var4);
      this.id_goto.id_class(var1, var2, var3, var4);
      this.id_while.id_class(var1, var2, var3, var4);

      for (LZ var6 : this.id_new) {
         var6.id_class(var1, var2, var3, var4);
      }

      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 16, 16777215);
   }

   private Optional<LZ> id_break(rgP_2 var1) {
      return this.id_new.stream().filter(var1x -> var1.equals(var1x.C_())).findFirst();
   }

   @Override
   public void id_private() {
      super.id_private();
      this.id_while.id_catch();
   }

   private void id_native() {
      this.id_synchronized.id_class(this.id_public.x_(), this.id_goto.x_());
      this.id_goto.id_class(this.id_goto.id_package());
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      super.v_();
      rgn_3 var1 = new rgn_3("gui.done");
      rgn_3 var2 = new rgn_3("pack.openFolder");
      this.id_break(var2).ifPresent(var1x -> {
         var1x.id_volatile = this.id_package / 2 + 25;
         var1x.id_final = this.id_int - 48;
      });
      this.id_break(var1).ifPresent(var1x -> {
         var1x.id_volatile = this.id_package / 2 + 25;
         var1x.id_final = this.id_int - 26;
      });
      this.id_class(
         (LF)(new LF(
            this.id_package / 2 - 204, this.id_int - 26, 30, 20, id_implements, var1x -> this.id_synchronized.id_class(this.id_return = rAw_1.id_class)
         ))
      );
      this.id_class(
         (LF)(new LF(
            this.id_package / 2 - 204 + 34, this.id_int - 26, 30, 20, id_finally, var1x -> this.id_synchronized.id_class(this.id_return = rAw_1.id_break)
         ))
      );
      this.id_class((LF)(new LF(this.id_package / 2 - 63, this.id_int - 26, 60, 20, id_else, var1x -> {
         this.id_volatile();
         this.id_volatile.id_break(this);
         this.id_finally();
         this.id_goto.id_class(this.id_public);
         this.id_native();
         this.id_goto.id_class(0.0);
      })));
      (this.id_while = new Lu_1(this.id_super, this.id_package / 2 - 203, this.id_int - 46, 198, 16, this.id_while, rgN_2.id_byte, true))
         .id_class(new rgn_3("options.resourcepack.search"))
         .id_catch(true);
      this.id_while.id_class(this.id_synchronized::id_class);
      this.id_native.add(this.id_while);
      this.id_public = this.id_case;
      this.id_native.remove(this.id_public);
      this.id_native.add(this.id_goto = new rAM(this.id_public));
      this.id_synchronized.id_class();
      this.id_synchronized.id_class(this.id_return == null ? (this.id_return = rAw_1.id_class) : this.id_return);
      this.id_synchronized.id_class(this.id_while.id_private());
      this.id_synchronized.id_break();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
