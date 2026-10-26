package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class rFC implements ruS_2<At_1> {
   private int id_class;
   private int id_break;
   private int id_byte;
   private int id_protected;
   private int id_throws;
   private int id_case;
   private List<byte[]> id_catch;
   private List<byte[]> id_private;
   private boolean id_implements;

   public int id_byte() {
      return this.id_break;
   }

   public rFC() {
   }

   public rFC(rfj_3 var1, rrse_3 var2, int var3, int var4, boolean var5) {
      this.id_class = var1.id_break;
      this.id_break = var1.id_byte;
      this.id_implements = var5;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_catch = Lists.newArrayList();
      this.id_private = Lists.newArrayList();

      for (int var6 = 0; var6 < 18; var6++) {
         if ((this.id_byte & 1 << var6) != 0) {
            roH_2 var7 = var2.id_class(rRo_1.SKY).id_class(rjh_3.id_class(var1, -1 + var6));
            if (var7 != null && !var7.id_byte()) {
               this.id_catch.add((byte[])var7.id_class().clone());
            } else {
               this.id_byte &= ~(1 << var6);
               if (var7 != null) {
                  this.id_throws |= 1 << var6;
               }
            }
         }

         if ((this.id_protected & 1 << var6) != 0) {
            roH_2 var8 = var2.id_class(rRo_1.BLOCK).id_class(rjh_3.id_class(var1, -1 + var6));
            if (var8 != null && !var8.id_byte()) {
               this.id_private.add((byte[])var8.id_class().clone());
            } else {
               this.id_protected &= ~(1 << var6);
               if (var8 != null) {
                  this.id_case |= 1 << var6;
               }
            }
         }
      }
   }

   public rFC(rfj_3 var1, rrse_3 var2, boolean var3) {
      this.id_class = var1.id_break;
      this.id_break = var1.id_byte;
      this.id_implements = var3;
      this.id_catch = Lists.newArrayList();
      this.id_private = Lists.newArrayList();

      for (int var4 = 0; var4 < 18; var4++) {
         roH_2 var5 = var2.id_class(rRo_1.SKY).id_class(rjh_3.id_class(var1, -1 + var4));
         roH_2 var6 = var2.id_class(rRo_1.BLOCK).id_class(rjh_3.id_class(var1, -1 + var4));
         if (var5 != null) {
            if (var5.id_byte()) {
               this.id_throws |= 1 << var4;
            } else {
               this.id_byte |= 1 << var4;
               this.id_catch.add((byte[])var5.id_class().clone());
            }
         }

         if (var6 != null) {
            if (var6.id_byte()) {
               this.id_case |= 1 << var4;
            } else {
               this.id_protected |= 1 << var4;
               this.id_private.add((byte[])var6.id_class().clone());
            }
         }
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_case();
      this.id_implements = var1.readBoolean();
      this.id_byte = var1.id_case();
      this.id_protected = var1.id_case();
      this.id_throws = var1.id_case();
      this.id_case = var1.id_case();
      this.id_catch = Lists.newArrayList();

      for (int var2 = 0; var2 < 18; var2++) {
         if ((this.id_byte & 1 << var2) != 0) {
            this.id_catch.add(var1.id_break(2048));
         }
      }

      this.id_private = Lists.newArrayList();

      for (int var3 = 0; var3 < 18; var3++) {
         if ((this.id_protected & 1 << var3) != 0) {
            this.id_private.add(var1.id_break(2048));
         }
      }
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_protected(this.id_break);
      var1.writeBoolean(this.id_implements);
      var1.id_protected(this.id_byte);
      var1.id_protected(this.id_protected);
      var1.id_protected(this.id_throws);
      var1.id_protected(this.id_case);

      for (byte[] var3 : this.id_catch) {
         var1.id_class(var3);
      }

      for (byte[] var5 : this.id_private) {
         var1.id_class(var5);
      }
   }

   public int id_throws() {
      return this.id_throws;
   }

   public boolean id_finally() {
      return this.id_implements;
   }

   public int id_catch() {
      return this.id_protected;
   }

   public List<byte[]> id_case() {
      return this.id_catch;
   }

   public List<byte[]> id_implements() {
      return this.id_private;
   }

   public int id_protected() {
      return this.id_byte;
   }

   public int id_private() {
      return this.id_case;
   }
}
