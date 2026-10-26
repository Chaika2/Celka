package celestial;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class rrxH_2 {
   private HU id_class = null;
   private int id_break = MT.id_new();
   private int id_byte = 4096;
   private int id_protected = 0;
   private int id_throws;
   private rrWR<rrxl_3> id_case = new rrWR<>();
   private rrxl_3 id_catch = null;
   private IntBuffer id_private = rrbb_3.id_break(this.id_byte);
   private IntBuffer id_implements = rrbb_3.id_break(this.id_byte);
   private final int id_finally = ju_3.id_private.id_break();
   private int id_extends = 7;
   private boolean id_native = rrbb_3.rs();

   private void id_byte(int var1) {
      int var2 = this.id_byte * 6 / 4;

      while (var2 < var1) {
         var2 = var2 * 6 / 4;
      }

      long var3 = this.id_protected(this.id_byte);
      long var5 = this.id_protected(var2);
      int var7 = MT.id_new();
      MT.id_catch(MT.id_catch, var7);
      MT.id_class(MT.id_catch, var5, MT.id_private);
      rrbb_3.id_catch("Expand VBO");
      MT.id_catch(MT.id_catch, 0);
      MT.id_catch(MT.id_throws, this.id_break);
      MT.id_catch(MT.id_case, var7);
      MT.id_class(MT.id_throws, MT.id_case, 0L, 0L, var3);
      rrbb_3.id_catch("Copy VBO: " + var5);
      MT.id_catch(MT.id_throws, 0);
      MT.id_catch(MT.id_case, 0);
      MT.id_finally(this.id_break);
      this.id_private = rrbb_3.id_break(var2);
      this.id_implements = rrbb_3.id_break(var2);
      this.id_break = var7;
      this.id_byte = var2;
   }

   public void id_byte() {
      MT.id_catch(MT.id_catch, 0);
   }

   public rrxH_2(HU var1) {
      this.id_class = var1;
      this.id_class();
      long var2 = this.id_protected(this.id_byte);
      MT.id_class(MT.id_catch, var2, MT.id_private);
      this.id_byte();
   }

   private int id_class(long var1) {
      return (int)(var1 / (long)this.id_finally);
   }

   public void id_class() {
      MT.id_catch(MT.id_catch, this.id_break);
   }

   public void id_class(int var1, rrxl_3 var2) {
      if (this.id_extends != var1) {
         if (this.id_private.position() > 0) {
            throw new IllegalArgumentException("Mixed region draw modes: " + this.id_extends + " != " + var1);
         }

         this.id_extends = var1;
      }

      this.id_private.put(var2.id_class());
      this.id_implements.put(var2.id_break());
   }

   public void id_class(ByteBuffer var1, rrxl_3 var2) {
      if (this.id_break >= 0) {
         int var3 = var2.id_class();
         int var4 = var2.id_break();
         int var5 = this.id_class((long)var1.limit());
         if (var5 <= 0) {
            if (var3 >= 0) {
               var2.id_class(-1);
               var2.id_break(0);
               this.id_case.id_byte(var2.id_protected());
               this.id_throws -= var4;
            }
         } else {
            if (var5 > var4) {
               var2.id_class(this.id_protected);
               var2.id_break(var5);
               this.id_protected += var5;
               if (var3 >= 0) {
                  this.id_case.id_byte(var2.id_protected());
               }

               this.id_case.id_break(var2.id_protected());
            }

            var2.id_break(var5);
            this.id_throws += var5 - var4;
            this.id_break(var2.id_byte());
            long var6 = this.id_protected(var2.id_class());
            this.id_class();
            MT.id_class(MT.id_catch, var6, var1);
            this.id_byte();
            if (this.id_protected > this.id_throws * 11 / 10) {
               this.id_class(1);
            }
         }
      }
   }

   private void id_class(int var1) {
      if (!this.id_case.id_throws()) {
         rrxl_3 var2 = this.id_catch;
         if (var2 == null || !this.id_case.id_protected(var2.id_protected())) {
            var2 = this.id_case.id_break().id_class();
         }

         int var3 = var2.id_class();
         rrxl_3 var4 = var2.id_throws();
         if (var4 == null) {
            var3 = 0;
         } else {
            var3 = var4.id_byte();
         }

         int var5 = 0;

         while (var2 != null && var5 < var1) {
            var5++;
            if (var2.id_class() == var3) {
               var3 += var2.id_break();
               var2 = var2.id_case();
            } else {
               int var6 = var2.id_class() - var3;
               if (var2.id_break() <= var6) {
                  this.id_class(var2.id_class(), var3, var2.id_break());
                  var2.id_class(var3);
                  var3 += var2.id_break();
                  var2 = var2.id_case();
               } else {
                  this.id_break(this.id_protected + var2.id_break());
                  this.id_class(var2.id_class(), this.id_protected, var2.id_break());
                  var2.id_class(this.id_protected);
                  this.id_protected = this.id_protected + var2.id_break();
                  rrxl_3 var7 = var2.id_case();
                  this.id_case.id_byte(var2.id_protected());
                  this.id_case.id_break(var2.id_protected());
                  var2 = var7;
               }
            }
         }

         if (var2 == null) {
            this.id_protected = this.id_case.id_byte().id_class().id_byte();
         }

         this.id_catch = var2;
      }
   }

   private void id_class(int var1, int var2, int var3) {
      long var4 = this.id_protected(var1);
      long var6 = this.id_protected(var2);
      long var8 = this.id_protected(var3);
      MT.id_catch(MT.id_throws, this.id_break);
      MT.id_catch(MT.id_case, this.id_break);
      MT.id_class(MT.id_throws, MT.id_case, var4, var6, var8);
      rrbb_3.id_catch("Copy VBO range");
      MT.id_catch(MT.id_throws, 0);
      MT.id_catch(MT.id_case, 0);
   }

   private void id_break(int var1) {
      if (this.id_byte < var1) {
         this.id_byte(var1);
      }
   }

   public void id_break() {
      this.id_class();
      ju_3.id_private.id_class(0L);
      if (this.id_native) {
         rrdL.id_package();
      }

      ((Buffer)this.id_private).flip();
      ((Buffer)this.id_implements).flip();
      MT.id_class(this.id_extends, this.id_private, this.id_implements);
      ((Buffer)this.id_private).limit(this.id_private.capacity());
      ((Buffer)this.id_implements).limit(this.id_implements.capacity());
      if (this.id_protected > this.id_throws * 11 / 10) {
         this.id_class(1);
      }
   }

   public int id_throws() {
      return this.id_protected;
   }

   private void id_case() {
      int var1 = 0;
      int var2 = 0;

      for (rrxl_3 var3 = this.id_case.id_break().id_class(); var3 != null; var3 = var3.id_case()) {
         var1++;
         var2 += var3.id_break();
         if (var3.id_class() < 0 || var3.id_break() <= 0 || var3.id_byte() > this.id_protected) {
            throw new RuntimeException("Invalid range: " + var3);
         }

         rrxl_3 var4 = var3.id_throws();
         if (var4 != null && var3.id_class() < var4.id_byte()) {
            throw new RuntimeException("Invalid range: " + var3);
         }

         rrxl_3 var5 = var3.id_case();
         if (var5 != null && var3.id_byte() > var5.id_class()) {
            throw new RuntimeException("Invalid range: " + var3);
         }
      }

      if (var1 != this.id_case.id_protected()) {
         throw new RuntimeException("Invalid count: " + var1 + " <> " + this.id_case.id_protected());
      } else if (var2 != this.id_throws) {
         throw new RuntimeException("Invalid size: " + var2 + " <> " + this.id_throws);
      }
   }

   private long id_protected(int var1) {
      return (long)var1 * (long)this.id_finally;
   }

   public void id_protected() {
      if (this.id_break >= 0) {
         MT.id_finally(this.id_break);
         this.id_break = -1;
      }
   }
}
