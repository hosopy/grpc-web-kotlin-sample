FROM node:10-alpine

EXPOSE 3000

RUN mkdir /app
COPY . /app
WORKDIR /app
RUN npm install

CMD ["npm", "run", "dev"]
