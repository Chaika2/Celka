package celestial;

import java.util.UUID;

public interface rrGB extends rrGS {
   void id_byte(boolean var1);

   int id_int();

   roM_2 id_this();

   @Override
   default void id_class(Ko_1 var1) {
      rrGS.super.id_class(var1);
      var1.id_class("Level name", this::id_volatile);
      var1.id_class(
         "Level game mode",
         () -> String.format(
               "Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", this.id_new().id_break(), this.id_new().id_class(), this.id_implements(), this.id_continue()
            )
      );
      var1.id_class(
         "Level weather",
         () -> String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", this.id_int(), this.id_private(), this.id_package(), this.id_catch())
      );
   }

   void id_class(rRl_1 var1);

   void id_class(roM_2 var1);

   void id_class(long var1);

   void id_class(UUID var1);

   void id_break(boolean var1);

   void id_break(long var1);

   void id_throws(int var1);

   void id_catch(int var1);

   void id_case(int var1);

   boolean id_continue();

   gi_3<rnW_2> id_else();

   rRl_1 id_new();

   int id_package();

   int id_return();

   boolean id_super();

   void id_protected(int var1);

   void id_private(int var1);

   int id_final();

   @Override
   String id_volatile();

   int id_synchronized();
}
