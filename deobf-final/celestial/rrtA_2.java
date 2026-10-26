package celestial;

public interface rrtA_2 extends MinecraftAccessor {
   void byte_();

   boolean class_(char var1, int var2);

   void class_(int var1, int var2, int var3);

   void class_(float var1, float var2, float var3, float var4, int var5, int var6);

   default boolean class_(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var1 >= var3 && var1 <= var3 + var5 && var2 >= var4 && var2 <= var4 + var6;
   }

   void class_();

   void break_();

   void break_(int var1, int var2, int var3);
}
