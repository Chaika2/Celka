package celestial;

import java.util.UUID;

public interface rrGB extends rrGS {
   void byte_(boolean var1);

   int int_();

   roM_2 this_();

   @Override
   default void class_(Ko_1 var1) {
      rrGS.super.class_(var1);
      var1.class_("Level name", this::volatile_);
      var1.class_(
         "Level game mode",
         () -> String.format(
               "Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", this.new_().break_(), this.new_().class_(), this.implements_(), this.continue_()
            )
      );
      var1.class_(
         "Level weather",
         () -> String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", this.int_(), this.private_(), this.package_(), this.catch_())
      );
   }

   void class_(rRl_1 var1);

   void class_(roM_2 var1);

   void class_(long var1);

   void class_(UUID var1);

   void break_(boolean var1);

   void break_(long var1);

   void throws_(int var1);

   void catch_(int var1);

   void case_(int var1);

   boolean continue_();

   gi_3<rnW_2> else_();

   rRl_1 new_();

   int package_();

   int return_();

   boolean super_();

   void protected_(int var1);

   void private_(int var1);

   int final_();

   @Override
   String volatile_();

   int synchronized_();
}
