package celestial;

import java.io.IOException;

public class rvE_2 implements ruS_2<At_1> {
   public static final rqO_2 class_ = new rqO_2("brand");
   public static final rqO_2 break_ = new rqO_2("debug/path");
   public static final rqO_2 byte_ = new rqO_2("debug/neighbors_update");
   public static final rqO_2 protected_ = new rqO_2("debug/caves");
   public static final rqO_2 throws_ = new rqO_2("debug/structures");
   public static final rqO_2 case_ = new rqO_2("debug/worldgen_attempt");
   public static final rqO_2 catch_ = new rqO_2("debug/poi_ticket_count");
   public static final rqO_2 private_ = new rqO_2("debug/poi_added");
   public static final rqO_2 implements_ = new rqO_2("debug/poi_removed");
   public static final rqO_2 finally_ = new rqO_2("debug/village_sections");
   public static final rqO_2 extends_ = new rqO_2("debug/goal_selector");
   public static final rqO_2 native_ = new rqO_2("debug/brain");
   public static final rqO_2 volatile_ = new rqO_2("debug/bee");
   public static final rqO_2 final_ = new rqO_2("debug/hive");
   public static final rqO_2 package_ = new rqO_2("debug/game_test_add_marker");
   public static final rqO_2 int_ = new rqO_2("debug/game_test_clear");
   public static final rqO_2 new_ = new rqO_2("debug/raids");
   private rqO_2 continue_;
   private ruu_3 super_;

   public ruu_3 byte_() {
      return new ruu_3(this.super_.copy());
   }

   public rvE_2() {
   }

   public rvE_2(rqO_2 var1, ruu_3 var2) {
      this.continue_ = var1;
      this.super_ = var2;
      if (var2.writerIndex() > 1048576) {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.continue_ = var1.volatile_();
      int var2 = var1.readableBytes();
      if (var2 >= 0 && var2 <= 1048576) {
         this.super_ = new ruu_3(var1.readBytes(var2));
      } else {
         throw new IOException("Payload may not be larger than 1048576 bytes");
      }
   }

   public rqO_2 break_() {
      return this.continue_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.continue_);
      var1.writeBytes(this.super_.copy());
   }
}
