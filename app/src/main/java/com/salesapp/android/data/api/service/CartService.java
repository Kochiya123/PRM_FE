package com.salesapp.android.data.api.service;

import com.salesapp.android.data.model.request.UpdateCartItemRequest;
import com.salesapp.android.data.model.response.CartResponse;
import com.salesapp.android.data.model.request.CartItemRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CartService {
    /**
     * Get the current user's active Cart
     */
    @GET("api/Cart")
    Call<CartResponse> getCart();

    /**
     * Add an item to the Cart
     */
    @POST("api/Cart/items")
    Call<CartResponse> addToCart(@Body CartItemRequest cartItemRequest);

    /**
     * Update Cart item quantity
     */
    @PUT("api/Cart/items")
    Call<CartResponse> updateCartItem(@Body UpdateCartItemRequest cartItemRequest);

    /**
     * Remove item from Cart
     */
    @DELETE("api/Cart/items/{cartItemId}")
    Call<CartResponse> removeCartItem(@Path("cartItemId") Long cartItemId);

    /**
     * Clear the Cart
     */
    @DELETE("api/Cart")
    Call<CartResponse> clearCart();
}