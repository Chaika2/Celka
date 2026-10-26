package celestial;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.util.List;

public class rvg_3 implements ruS_2<At_1> {
   private rvY_2 id_class;
   private final List<rvo_3> id_break = Lists.newArrayList();

   public rvY_2 id_byte() {
      return this.id_class;
   }

   public rvg_3() {
   }

   public rvg_3(rvY_2 var1, Iterable<rhN_2> var2) {
      this.id_class = var1;

      for (rhN_2 var4 : var2) {
         this.id_break.add(new rvo_3(this, var4.sv(), var4.id_native, var4.id_finally.id_break(), var4.id_boolean()));
      }
   }

   public rvg_3(rvY_2 var1, rhN_2... var2) {
      this.id_class = var1;

      for (rhN_2 var6 : var2) {
         this.id_break.add(new rvo_3(this, var6.sv(), var6.id_native, var6.id_finally.id_break(), var6.id_boolean()));
      }
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("action", this.id_class).add("entries", this.id_break).toString();
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_class(rvY_2.class);
      int var2 = var1.id_case();

      for (int var3 = 0; var3 < var2; var3++) {
         GameProfile var4 = null;
         int var5 = 0;
         rRl_1 var6 = null;
         rgP_2 var7 = null;
         switch (this.id_class) {
            case ADD_PLAYER:
               var4 = new GameProfile(var1.id_private(), var1.id_throws(16));
               int var8 = var1.id_case();
               int var9 = 0;

               for (; var9 < var8; var9++) {
                  String var10 = var1.id_throws(32767);
                  String var11 = var1.id_throws(32767);
                  if (var1.readBoolean()) {
                     var4.getProperties().put(var10, new Property(var10, var11, var1.id_throws(32767)));
                  } else {
                     var4.getProperties().put(var10, new Property(var10, var11));
                  }
               }

               var6 = rRl_1.id_class(var1.id_case());
               var5 = var1.id_case();
               if (var1.readBoolean()) {
                  var7 = var1.id_throws();
               }
               break;
            case UPDATE_GAME_MODE:
               var4 = new GameProfile(var1.id_private(), (String)null);
               var6 = rRl_1.id_class(var1.id_case());
               break;
            case UPDATE_LATENCY:
               var4 = new GameProfile(var1.id_private(), (String)null);
               var5 = var1.id_case();
               break;
            case UPDATE_DISPLAY_NAME:
               var4 = new GameProfile(var1.id_private(), (String)null);
               if (var1.readBoolean()) {
                  var7 = var1.id_throws();
               }
               break;
            case REMOVE_PLAYER:
               var4 = new GameProfile(var1.id_private(), (String)null);
         }

         this.id_break.add(new rvo_3(this, var4, var5, var6, var7));
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   public List<rvo_3> id_break() {
      return this.id_break;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      var1.id_protected(this.id_break.size());

      for (rvo_3 var3 : this.id_break) {
         switch (this.id_class) {
            case ADD_PLAYER:
               var1.id_class(var3.id_class().getId());
               var1.id_class(var3.id_class().getName());
               var1.id_protected(var3.id_class().getProperties().size());

               for (Property var5 : var3.id_class().getProperties().values()) {
                  var1.id_class(var5.getName());
                  var1.id_class(var5.getValue());
                  if (var5.hasSignature()) {
                     var1.writeBoolean(true);
                     var1.id_class(var5.getSignature());
                  } else {
                     var1.writeBoolean(false);
                  }
               }

               var1.id_protected(var3.id_byte().id_class());
               var1.id_protected(var3.id_break());
               if (var3.id_protected() == null) {
                  var1.writeBoolean(false);
               } else {
                  var1.writeBoolean(true);
                  var1.id_class(var3.id_protected());
               }
               break;
            case UPDATE_GAME_MODE:
               var1.id_class(var3.id_class().getId());
               var1.id_protected(var3.id_byte().id_class());
               break;
            case UPDATE_LATENCY:
               var1.id_class(var3.id_class().getId());
               var1.id_protected(var3.id_break());
               break;
            case UPDATE_DISPLAY_NAME:
               var1.id_class(var3.id_class().getId());
               if (var3.id_protected() == null) {
                  var1.writeBoolean(false);
               } else {
                  var1.writeBoolean(true);
                  var1.id_class(var3.id_protected());
               }
               break;
            case REMOVE_PLAYER:
               var1.id_class(var3.id_class().getId());
         }
      }
   }
}
