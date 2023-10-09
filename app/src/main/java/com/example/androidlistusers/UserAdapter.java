package com.example.androidlistusers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private Context context;
    private List<UserModel> userList;

    public UserAdapter(Context context) {
        this.context = context;
        this.userList = generateRandomUsers();
    }


    private List<UserModel> generateRandomUsers() {
        List<UserModel> users = new ArrayList<>();
        Random random = new Random();


        int[] avatarResources = {R.drawable.car, R.drawable.avatar2, R.drawable.avatar3, R.drawable.avatar4, R.drawable.avatar5};
        String[] firstNames = {"John", "Alice", "Bob", "Emily", "David", "Eva", "Oliver", "Sophia", "James", "Emma"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas"};
        String[] countries = {"USA", "Canada", "UK"};
        String[][] cities = {{"New York", "Los Angeles", "Chicago", "Houston", "Miami"},
                {"Toronto", "Vancouver", "Montreal", "Calgary", "Ottawa"},
                {"London", "Manchester", "Liverpool", "Birmingham", "Edinburgh"}};

        for (int i = 0; i < 10; i++) {
            int avatarIndex = random.nextInt(avatarResources.length);
            int firstNameIndex = random.nextInt(firstNames.length);
            int lastNameIndex = random.nextInt(lastNames.length);
            int age = random.nextInt(86) + 14; // 14-99
            int countryIndex = random.nextInt(countries.length);
            int cityIndex = random.nextInt(cities[countryIndex].length);

            users.add(new UserModel(avatarResources[avatarIndex], firstNames[firstNameIndex], lastNames[lastNameIndex], age,
                    countries[countryIndex], cities[countryIndex][cityIndex]));
        }

        return users;
    }



    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position) {

    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView img;
        final TextView name;
        final TextView country;
        final TextView city;
        final TextView age;

        ViewHolder(View view) {
            super(view);
            img = view.findViewById(R.id.avatarImageView);
            name = view.findViewById(R.id.nameTextView);
            country = view.findViewById(R.id.countryTextView);
            age = view.findViewById(R.id.ageTextView);
            city = view.findViewById(R.id.cityTextView);
        }
    }
}
