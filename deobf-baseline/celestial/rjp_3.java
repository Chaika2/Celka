package celestial;

public abstract class rjp_3 {
   private static final rpB_2[] id_protected = rpB_2.values();
   protected final int id_class;
   protected final int id_break;
   protected final int id_byte;

   public int id_byte(rpB_2 var1) {
      return var1.id_class(this.id_class, this.id_break, this.id_byte);
   }

   public int id_byte() {
      return this.id_byte(rpB_2.Y);
   }

   public boolean id_byte(int var1, int var2, int var3) {
      if (var1 >= 0 && var2 >= 0 && var3 >= 0) {
         return var1 < this.id_class && var2 < this.id_break && var3 < this.id_byte ? this.id_break(var1, var2, var3) : false;
      } else {
         return false;
      }
   }

   protected rjp_3(int var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   protected boolean id_class(int var1, int var2, int var3, int var4) {
      for (int var5 = var1; var5 < var2; var5++) {
         if (!this.id_byte(var3, var4, var5)) {
            return false;
         }
      }

      return true;
   }

   private void id_class(rjT_2 var1, ryF_2 var2, boolean var3) {
      ryF_2 var4 = var2.id_class();
      int var5 = this.id_byte(var4.id_class(rpB_2.X));
      int var6 = this.id_byte(var4.id_class(rpB_2.Y));
      int var7 = this.id_byte(var4.id_class(rpB_2.Z));

      for (int var8 = 0; var8 <= var5; var8++) {
         for (int var9 = 0; var9 <= var6; var9++) {
            int var10 = -1;

            for (int var11 = 0; var11 <= var7; var11++) {
               int var12 = 0;
               int var13 = 0;

               for (int var14 = 0; var14 <= 1; var14++) {
                  for (int var15 = 0; var15 <= 1; var15++) {
                     if (this.id_class(var4, var8 + var14 - 1, var9 + var15 - 1, var11)) {
                        var12++;
                        var13 ^= var14 ^ var15;
                     }
                  }
               }

               if (var12 == 1 || var12 == 3 || var12 == 2 && (var13 & 1) == 0) {
                  if (var3) {
                     if (var10 == -1) {
                        var10 = var11;
                     }
                  } else {
                     var1.consume(
                        var4.id_class(var8, var9, var11, rpB_2.X),
                        var4.id_class(var8, var9, var11, rpB_2.Y),
                        var4.id_class(var8, var9, var11, rpB_2.Z),
                        var4.id_class(var8, var9, var11 + 1, rpB_2.X),
                        var4.id_class(var8, var9, var11 + 1, rpB_2.Y),
                        var4.id_class(var8, var9, var11 + 1, rpB_2.Z)
                     );
                  }
               } else if (var10 != -1) {
                  var1.consume(
                     var4.id_class(var8, var9, var10, rpB_2.X),
                     var4.id_class(var8, var9, var10, rpB_2.Y),
                     var4.id_class(var8, var9, var10, rpB_2.Z),
                     var4.id_class(var8, var9, var11, rpB_2.X),
                     var4.id_class(var8, var9, var11, rpB_2.Y),
                     var4.id_class(var8, var9, var11, rpB_2.Z)
                  );
                  var10 = -1;
               }
            }
         }
      }
   }

   public void id_class(rjT_2 var1, boolean var2) {
      this.id_class(var1, ryF_2.NONE, var2);
      this.id_class(var1, ryF_2.FORWARD, var2);
      this.id_class(var1, ryF_2.BACKWARD, var2);
   }

   public boolean id_class(ryF_2 var1, int var2, int var3, int var4) {
      return this.id_byte(var1.id_class(var2, var3, var4, rpB_2.X), var1.id_class(var2, var3, var4, rpB_2.Y), var1.id_class(var2, var3, var4, rpB_2.Z));
   }

   private void id_class(rjq_3 var1, ryF_2 var2) {
      ryF_2 var3 = var2.id_class();
      rpB_2 var4 = var3.id_class(rpB_2.Z);
      int var5 = this.id_byte(var3.id_class(rpB_2.X));
      int var6 = this.id_byte(var3.id_class(rpB_2.Y));
      int var7 = this.id_byte(var4);
      rpr_3 var8 = rpr_3.id_class(var4, rpG_2.NEGATIVE);
      rpr_3 var9 = rpr_3.id_class(var4, rpG_2.POSITIVE);

      for (int var10 = 0; var10 < var5; var10++) {
         for (int var11 = 0; var11 < var6; var11++) {
            boolean var12 = false;

            for (int var13 = 0; var13 <= var7; var13++) {
               boolean var14 = var13 != var7 && this.id_break(var3, var10, var11, var13);
               if (!var12 && var14) {
                  var1.consume(
                     var8,
                     var3.id_class(var10, var11, var13, rpB_2.X),
                     var3.id_class(var10, var11, var13, rpB_2.Y),
                     var3.id_class(var10, var11, var13, rpB_2.Z)
                  );
               }

               if (var12 && !var14) {
                  var1.consume(
                     var9,
                     var3.id_class(var10, var11, var13 - 1, rpB_2.X),
                     var3.id_class(var10, var11, var13 - 1, rpB_2.Y),
                     var3.id_class(var10, var11, var13 - 1, rpB_2.Z)
                  );
               }

               var12 = var14;
            }
         }
      }
   }

   public void id_class(rjq_3 var1) {
      this.id_class(var1, ryF_2.NONE);
      this.id_class(var1, ryF_2.FORWARD);
      this.id_class(var1, ryF_2.BACKWARD);
   }

   protected boolean id_class(int var1, int var2, int var3, int var4, int var5) {
      for (int var6 = var1; var6 < var2; var6++) {
         if (!this.id_class(var3, var4, var6, var5)) {
            return false;
         }
      }

      return true;
   }

   protected void id_class(int var1, int var2, int var3, int var4, boolean var5) {
      for (int var6 = var1; var6 < var2; var6++) {
         this.id_class(var3, var4, var6, false, var5);
      }
   }

   public int id_class(rpB_2 var1, int var2, int var3) {
      if (var2 >= 0 && var3 >= 0) {
         rpB_2 var4 = ryF_2.FORWARD.id_class(var1);
         rpB_2 var5 = ryF_2.BACKWARD.id_class(var1);
         if (var2 < this.id_byte(var4) && var3 < this.id_byte(var5)) {
            int var6 = this.id_byte(var1);
            ryF_2 var7 = ryF_2.id_class(rpB_2.X, var1);

            for (int var8 = var6 - 1; var8 >= 0; var8--) {
               if (this.id_break(var7, var8, var2, var3)) {
                  return var8 + 1;
               }
            }

            return 0;
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public boolean id_class() {
      for (rpB_2 var4 : id_protected) {
         if (this.id_class(var4) >= this.id_break(var4)) {
            return true;
         }
      }

      return false;
   }

   public abstract void id_class(int var1, int var2, int var3, boolean var4, boolean var5);

   public abstract int id_class(rpB_2 var1);

   public int id_break() {
      return this.id_byte(rpB_2.X);
   }

   public void id_break(rjT_2 var1, boolean var2) {
      rjd_3 var3 = new rjd_3(this);

      for (int var4 = 0; var4 <= this.id_class; var4++) {
         for (int var5 = 0; var5 <= this.id_break; var5++) {
            int var6 = -1;

            for (int var7 = 0; var7 <= this.id_byte; var7++) {
               if (var3.id_byte(var4, var5, var7)) {
                  if (var2) {
                     if (var6 == -1) {
                        var6 = var7;
                     }
                  } else {
                     var1.consume(var4, var5, var7, var4 + 1, var5 + 1, var7 + 1);
                  }
               } else if (var6 != -1) {
                  int var8 = var4;
                  int var9 = var4;
                  int var10 = var5;
                  int var11 = var5;
                  var3.id_class(var6, var7, var4, var5, false);

                  while (var3.id_class(var6, var7, var8 - 1, var10)) {
                     var3.id_class(var6, var7, var8 - 1, var10, false);
                     var8--;
                  }

                  while (var3.id_class(var6, var7, var9 + 1, var10)) {
                     var3.id_class(var6, var7, var9 + 1, var10, false);
                     var9++;
                  }

                  while (var3.id_class(var8, var9 + 1, var6, var7, var10 - 1)) {
                     for (int var12 = var8; var12 <= var9; var12++) {
                        var3.id_class(var6, var7, var12, var10 - 1, false);
                     }

                     var10--;
                  }

                  while (var3.id_class(var8, var9 + 1, var6, var7, var11 + 1)) {
                     for (int var13 = var8; var13 <= var9; var13++) {
                        var3.id_class(var6, var7, var13, var11 + 1, false);
                     }

                     var11++;
                  }

                  var1.consume(var8, var10, var6, var9 + 1, var11 + 1, var7);
                  var6 = -1;
               }
            }
         }
      }
   }

   public boolean id_break(ryF_2 var1, int var2, int var3, int var4) {
      return this.id_break(var1.id_class(var2, var3, var4, rpB_2.X), var1.id_class(var2, var3, var4, rpB_2.Y), var1.id_class(var2, var3, var4, rpB_2.Z));
   }

   public abstract boolean id_break(int var1, int var2, int var3);

   public abstract int id_break(rpB_2 var1);

   public int id_protected() {
      return this.id_byte(rpB_2.Z);
   }
}
